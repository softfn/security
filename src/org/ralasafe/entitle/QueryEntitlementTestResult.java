package org.ralasafe.entitle;

import java.util.ArrayList;

public class QueryEntitlementTestResult {
    private boolean failed;
    private String errorMessage;
    private ArrayList userCategoryTestResults = new ArrayList();
    private QueryTestResult queryTestResult;
    private Query matchedQuery;

    public Query getMatchedQuery() {
        return matchedQuery;
    }

    public void setMatchedQuery(Query matchedQuery) {
        this.matchedQuery = matchedQuery;
    }

    public boolean isFailed() {
        return failed;
    }

    public void setFailed(boolean failed) {
        this.failed = failed;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public ArrayList getUserCategoryTestResults() {
        return userCategoryTestResults;
    }

    public void setUserCategoryTestResults(ArrayList userCategoryTestResults) {
        this.userCategoryTestResults = userCategoryTestResults;
    }

    public QueryTestResult getQueryTestResult() {
        return queryTestResult;
    }

    public void setQueryTestResults(QueryTestResult queryTestResult) {
        this.queryTestResult = queryTestResult;
    }
}
