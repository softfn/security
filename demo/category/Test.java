package category;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.11
 * User: SoftFn
 * Date: 13-9-9
 * Time: 下午4:14
 * To change this template use File | Settings | File Templates.
 */
public class Test {
    public static void main(String[] args) throws Exception {
        UserCategory userCategory = new UserCategory();
        userCategory.setName("查询本部门用户");

        List<Variable> variables = new ArrayList<Variable>();
        ContextVar contextVar = new ContextVar();
        contextVar.setName("CONTEXT1");
        contextVar.setKey("ID");
        variables.add(contextVar);
        FixVar fixVar = new FixVar();
        fixVar.setName("PARAM1");
        fixVar.setType(FixVar.VarType.STRING);
        fixVar.setValue("1233");
        variables.add(fixVar);
        FixVar fixVar2 = new FixVar();
        fixVar2.setName("PARAM1");
        fixVar2.setType(FixVar.VarType.STRING);
        fixVar2.setValue("33");
        variables.add(fixVar2);
        UserVar userVar = new UserVar();
        userVar.setName("当前用户名称");
        userVar.setKey("zwb");
        variables.add(userVar);
        FormulaVar formulaVar = new FormulaVar();
        formulaVar.setName("余额");
        formulaVar.setOperator(FormulaVar.PperatorType.SUBTRACT);
        formulaVar.setVariable1("PARAM1");
        formulaVar.setVariable2("PARAM2");
        formulaVar.setReturnType(FormulaVar.ReturnType.INTEGER);
        variables.add(formulaVar);
        QueryVar queryVar = new QueryVar();
        queryVar.setName("MONEY");
        queryVar.setRefId("000000000000000000000001");
        queryVar.setRefDesc("今天贷款总额");
        variables.add(queryVar);
        userCategory.setVariables(variables);

        ExprGroup exprGroup = new ExprGroup();
        userCategory.setExprGroup(exprGroup);

        CustomScript customScript = new CustomScript();
        customScript.setContent("CONTEXT1.equal(PARAM1)");
        userCategory.setCustomScript(customScript);

//        //序列化对象
//        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("D:\\objectFile.obj"));
//        out.writeObject(userCategory);
//        out.close();
//
//
//        //反序列化对象
//        ObjectInputStream in = new ObjectInputStream(new FileInputStream("D:\\objectFile.obj"));
//        UserCategory obj3 = (UserCategory) in.readObject();    //读取customer对象
//        System.out.println("UserCategory " + obj3);
//        in.close();


        try {
            File file = new File("C:\\UserCategory1.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(UserCategory.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            jaxbMarshaller.marshal(userCategory, file);
            jaxbMarshaller.marshal(userCategory, System.out);
        } catch (JAXBException e) {
            e.printStackTrace();
        }

    }
}
