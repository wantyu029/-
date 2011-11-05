package gnu.inet.nntp;


public interface NNTPConstants {

   String ARTICLE = "ARTICLE";
   short ARTICLE_FOLLOWS = 220;
   short ARTICLE_NOT_WANTED = 435;
   short ARTICLE_NOT_WANTED_VIA_TAKETHIS = 438;
   short ARTICLE_POSTED = 240;
   short ARTICLE_REJECTED = 437;
   short ARTICLE_RETRIEVED = 223;
   short ARTICLE_TRANSFERRED = 235;
   short ARTICLE_TRANSFERRED_OK = 239;
   short ARTICLE_TRANSFER_FAILED = 439;
   String AUTHINFO_GENERIC = "AUTHINFO GENERIC";
   short AUTHINFO_OK = 281;
   String AUTHINFO_PASS = "AUTHINFO PASS";
   short AUTHINFO_REJECTED = 482;
   String AUTHINFO_SIMPLE = "AUTHINFO SIMPLE";
   short AUTHINFO_SIMPLE_DENIED = 452;
   short AUTHINFO_SIMPLE_OK = 350;
   short AUTHINFO_SIMPLE_REQUIRED = 450;
   String AUTHINFO_USER = "AUTHINFO USER";
   String BODY = "BODY";
   short BODY_FOLLOWS = 222;
   String CHECK = "CHECK";
   short CLOSING_CONNECTION = 205;
   short COMMAND_NOT_RECOGNIZED = 500;
   String DATE = "DATE";
   short DATE_OK = 111;
   String GROUP = "GROUP";
   short GROUP_SELECTED = 211;
   String HEAD = "HEAD";
   short HEAD_FOLLOWS = 221;
   String HELP = "HELP";
   short HELP_TEXT = 100;
   String IHAVE = "IHAVE";
   short INTERNAL_ERROR = 503;
   String LAST = "LAST";
   String LIST = "LIST";
   String LISTGROUP = "LISTGROUP";
   String LIST_ACTIVE = "LIST ACTIVE";
   String LIST_ACTIVE_TIMES = "LIST ACTIVE.TIMES";
   String LIST_DISTRIBUTIONS = "LIST DISTRIBUTIONS";
   String LIST_DISTRIB_PATS = "LIST DISTRIB.PATS";
   short LIST_FOLLOWS = 215;
   String LIST_NEWSGROUPS = "LIST NEWSGROUPS";
   String LIST_OVERVIEW_FMT = "LIST OVERVIEW.FMT";
   String LIST_SUBSCRIPTIONS = "LIST SUBSCRIPTIONS";
   String MODE_READER = "MODE READER";
   String MODE_STREAM = "MODE STREAM";
   String NEWGROUPS = "NEWGROUPS";
   short NEWGROUPS_LIST_FOLLOWS = 231;
   String NEWNEWS = "NEWNEWS";
   short NEWNEWS_LIST_FOLLOWS = 230;
   String NEXT = "NEXT";
   short NO_ARTICLE_SELECTED = 420;
   short NO_GROUP_SELECTED = 412;
   short NO_NEXT_ARTICLE = 421;
   short NO_POSTING_ALLOWED = 201;
   short NO_PREVIOUS_ARTICLE = 422;
   short NO_SUCH_ARTICLE = 430;
   short NO_SUCH_ARTICLE_NUMBER = 423;
   short NO_SUCH_GROUP = 411;
   short OVERVIEW_FOLLOWS = 224;
   short PERMISSION_DENIED = 502;
   String POST = "POST";
   short POSTING_ALLOWED = 200;
   short POSTING_FAILED = 441;
   short POSTING_NOT_ALLOWED = 440;
   String QUIT = "QUIT";
   short SEND_ARTICLE = 340;
   short SEND_ARTICLE_VIA_TAKETHIS = 238;
   short SEND_AUTHINFOPASS = 381;
   short SEND_AUTHINFO_SIMPLE = 350;
   short SEND_TRANSFER_ARTICLE = 335;
   short SERVICE_DISCONTINUED = 400;
   String SLAVE = "SLAVE";
   short SLAVE_ACKNOWLEDGED = 202;
   String STAT = "STAT";
   short STREAMING_OK = 203;
   short SYNTAX_ERROR = 501;
   String TAKETHIS = "TAKETHIS";
   short TRANSFER_FAILED = 436;
   short TRANSFER_PERMISSION_DENIED = 480;
   short TRY_AGAIN_LATER = 431;
   String XGTITLE = "XGTITLE";
   short XGTITLE_LIST_FOLLOWS = 481;
   String XHDR = "XHDR";
   String XINDEX = "XINDEX";
   String XOVER = "XOVER";
   String XPAT = "XPAT";
   String XPATH = "XPATH";
   String XREPLIC = "XREPLIC";
   String XROVER = "XROVER";

}
