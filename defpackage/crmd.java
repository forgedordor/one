package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crmd {
    private static final String[] A;
    private static final String[] B;
    private static final String[] C;
    private static final String[] D;
    private static final String[] E;
    private static final String[] F;
    public static final String[] a;
    public static final String[] b;
    static final String[] c;
    public static final String[] d;
    public static final String[] e;
    public static final String[] f;
    public static final String[] g;
    public static final String[] h;
    public static final String[] i;
    public static final String[] j;
    public static final String[] k;
    public static final String[] l;
    public static final String[] m;
    public static final String[] n;
    public static final String[] o;
    public static final String[] p;
    public static final String[] q;
    public static final String[] r;
    static final ekgp s;
    private static final String[] t;
    private static final String[] u;
    private static final String[] v;
    private static final String[] w;
    private static final String[] x;
    private static final String[] y;
    private static final String[] z;

    static {
        String[] strArr = {"android.permission.RECORD_AUDIO"};
        a = strArr;
        String[] strArr2 = {"android.permission.SCHEDULE_EXACT_ALARM"};
        b = strArr2;
        String[] strArr3 = {"android.permission.CAMERA"};
        c = strArr3;
        String[] strArr4 = {"android.permission.CAMERA", "android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"};
        t = strArr4;
        String[] strArr5 = {"android.permission.CAMERA", "android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_AUDIO"};
        u = strArr5;
        String[] strArr6 = {"android.permission.CAMERA", "android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_VISUAL_USER_SELECTED"};
        v = strArr6;
        boolean z2 = craf.h;
        if (z2) {
            strArr4 = strArr6;
        } else if (craf.f) {
            strArr4 = strArr5;
        }
        d = strArr4;
        String[] strArr7 = {"android.permission.CAMERA", "android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"};
        w = strArr7;
        String[] strArr8 = {"android.permission.CAMERA", "android.permission.READ_MEDIA_IMAGES"};
        x = strArr8;
        String[] strArr9 = {"android.permission.CAMERA", "android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VISUAL_USER_SELECTED"};
        y = strArr9;
        if (z2) {
            strArr7 = strArr9;
        } else if (craf.f) {
            strArr7 = strArr8;
        }
        e = strArr7;
        String[] strArr10 = (String[]) eknr.b(strArr7, strArr, String.class);
        z = strArr10;
        String[] strArr11 = {"android.permission.CAMERA", "android.permission.READ_MEDIA_VIDEO", "android.permission.RECORD_AUDIO"};
        A = strArr11;
        String[] strArr12 = {"android.permission.CAMERA", "android.permission.READ_MEDIA_VIDEO", "android.permission.RECORD_AUDIO", "android.permission.READ_MEDIA_VISUAL_USER_SELECTED"};
        B = strArr12;
        if (craf.h) {
            strArr10 = strArr12;
        } else if (craf.f) {
            strArr10 = strArr11;
        }
        f = strArr10;
        String[] strArr13 = {"android.permission.ACCESS_FINE_LOCATION"};
        g = strArr13;
        String[] strArr14 = {"android.permission.READ_SMS", "android.permission.SEND_SMS", "android.permission.RECEIVE_SMS", "android.permission.RECEIVE_MMS"};
        h = strArr14;
        String[] strArr15 = {"android.permission.READ_CONTACTS", "android.permission.WRITE_CONTACTS"};
        i = strArr15;
        String[] strArr16 = {"android.permission.READ_PHONE_STATE"};
        j = strArr16;
        ekgb.r("android.permission.READ_PRIVILEGED_PHONE_STATE");
        String[] strArr17 = {"android.permission.CALL_PHONE"};
        k = strArr17;
        String[] strArr18 = {"android.permission.READ_CALL_LOG"};
        l = strArr18;
        String[] strArr19 = {"android.permission.CALL_PRIVILEGED"};
        m = strArr19;
        String[] strArr20 = {"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"};
        C = strArr20;
        String[] strArr21 = {"android.permission.READ_EXTERNAL_STORAGE", "android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_AUDIO", "android.permission.WRITE_EXTERNAL_STORAGE"};
        D = strArr21;
        String[] strArr22 = {"android.permission.READ_EXTERNAL_STORAGE", "android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_AUDIO", "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_MEDIA_VISUAL_USER_SELECTED"};
        E = strArr22;
        if (craf.h) {
            strArr21 = strArr22;
        } else if (!craf.f) {
            strArr21 = strArr20;
        }
        n = strArr21;
        String[] strArr23 = {"android.permission.RECEIVE_WAP_PUSH"};
        o = strArr23;
        String[] strArr24 = (String[]) eknr.b(strArr14, (String[]) eknr.b(strArr16, strArr15, String.class), String.class);
        p = strArr24;
        String[] strArr25 = {"android.permission.POST_NOTIFICATIONS"};
        F = strArr25;
        if (!craf.f) {
            strArr25 = new String[0];
        }
        q = strArr25;
        String[] strArr26 = craf.e ? new String[]{"android.permission.READ_PHONE_NUMBERS"} : new String[0];
        r = strArr26;
        ekgi ekgiVar = new ekgi();
        ekgiVar.i(crmc.RECORD_AUDIO_PERMISSIONS, strArr);
        ekgiVar.i(crmc.CAMERA_GALLERY_ROLL_PERMISSIONS, strArr4);
        ekgiVar.i(crmc.CAMERA_IMAGE_PERMISSIONS, strArr7);
        ekgiVar.i(crmc.CAMERA_VIDEO_PERMISSIONS, strArr10);
        ekgiVar.i(crmc.STORAGE_PERMISSIONS, strArr21);
        ekgiVar.i(crmc.LOCATION_PERMISSIONS, strArr13);
        ekgiVar.i(crmc.CALL_PHONE_PERMISSIONS, strArr17);
        ekgiVar.i(crmc.MINIMUM_REQUIRED_PERMISSIONS, strArr24);
        ekgiVar.i(crmc.CAMERA_PERMISSIONS, strArr3);
        ekgiVar.i(crmc.RECEIVE_WAP_PUSH_PERMISSIONS, strArr23);
        ekgiVar.i(crmc.CONTACTS_PERMISSIONS, strArr15);
        ekgiVar.i(crmc.PRIVILEGED_CALL_PERMISSIONS, strArr19);
        ekgiVar.i(crmc.CALL_LOG_PERMISSIONS, strArr18);
        ekgiVar.i(crmc.SCHEDULED_SEND_PERMISSIONS, strArr2);
        ekgiVar.i(crmc.NOTIFICATIONS, strArr25);
        ekgiVar.i(crmc.READ_PHONE_NUMBERS, strArr26);
        s = ekgiVar.c();
    }
}
