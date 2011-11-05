package com.android.exchange;


public interface EmailServiceStatus {

   int ATTACHMENT_NOT_FOUND = 17;
   int CONNECTION_ERROR = 32;
   int CUSTOM_ERROR_BASE = 255;
   int ERROR_EMPTYTRASH_FAILURE = 131072;
   int ERROR_EMPTYTRASH_RESPONSE_PARSE = 65536;
   int ERROR_EMPTYTRASH_TIMEOUT = 393216;
   int ERROR_FETCH_FAILURE = 262144;
   int ERROR_FETCH_NULLMSG = 458752;
   int ERROR_FETCH_OUTOFMEMORY = 327680;
   int ERROR_FETCH_RESPONSE_PARSE = 196608;
   int ERROR_FOLDER_EXISTS = 37;
   int ERROR_FOLDER_NOT_EXIST = 36;
   int ERROR_FOLDER_PARENT_NOT_FOUND = 38;
   int ERROR_GAL_INVALID_RANGE = 250;
   int ERROR_GAL_NULL_STRING = 252;
   int ERROR_GAL_RESPONSE_PARSE = 251;
   int ERROR_ITEM = 33;
   int ERROR_NO_PROTOCOL_SUPPORT = 254;
   int ERROR_OOO_GET_ERROR = 248;
   int ERROR_OOO_RESPONSE_PARSE = 247;
   int ERROR_OOO_SET_ERROR = 249;
   int ERROR_SERVER_CONNECT = 253;
   int ERROR_SERVER_ERROR = 34;
   int ERROR_SYSTEM_FOLDER = 35;
   int FOLDER_NOT_CREATED = 20;
   int FOLDER_NOT_DELETED = 18;
   int FOLDER_NOT_RENAMED = 19;
   int IN_PROGRESS = 1;
   int LOADMORE_CANCEL = 1048576;
   int LOGIN_FAILED = 22;
   int MEETING_RESP_ERR_ON_MAILBOX = 51;
   int MEETING_RESP_INVALID_REQ = 50;
   int MEETING_RESP_PARENT_NOT_FOUND = 49;
   int MESSAGE_NOT_FOUND = 16;
   int REMOTE_EXCEPTION = 21;
   int SEARCH_ERROR = 48;
   int SUCCESS;

}
