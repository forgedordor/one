package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public enum dddt implements evst {
    INVOCATION_TYPE_UNSPECIFIED(0),
    INVOCATION_TYPE_GIS_BEGIN_SIGNIN(1),
    INVOCATION_TYPE_GIS_CREDMAN_PROVIDER(2),
    INVOCATION_TYPE_GIS_FIDO_CLIENT(3),
    INVOCATION_TYPE_REDIRECTED_FIDO_PRIVILEGED_API_CLIENT(4),
    INVOCATION_TYPE_REDIRECTED_FIDO_API_CLIENT(5),
    INVOCATION_TYPE_FIDO_SECURITY_KEY_FLOW(6),
    INVOCATION_TYPE_FIDO_HYBRID_FLOW(7),
    INVOCATION_TYPE_FIDO_TEST_PURPOSE(8),
    INVOCATION_TYPE_MODULE_CREDMAN_PROVIDER(9),
    INVOCATION_TYPE_CONDITIONAL_CREATE_CHROME_SYNC_KEY(10),
    INVOCATION_TYPE_AUTHMOSIS_PASSKEY(11);

    public final int m;

    dddt(int i) {
        this.m = i;
    }

    public static dddt b(int i) {
        switch (i) {
            case 0:
                return INVOCATION_TYPE_UNSPECIFIED;
            case 1:
                return INVOCATION_TYPE_GIS_BEGIN_SIGNIN;
            case 2:
                return INVOCATION_TYPE_GIS_CREDMAN_PROVIDER;
            case 3:
                return INVOCATION_TYPE_GIS_FIDO_CLIENT;
            case 4:
                return INVOCATION_TYPE_REDIRECTED_FIDO_PRIVILEGED_API_CLIENT;
            case 5:
                return INVOCATION_TYPE_REDIRECTED_FIDO_API_CLIENT;
            case 6:
                return INVOCATION_TYPE_FIDO_SECURITY_KEY_FLOW;
            case 7:
                return INVOCATION_TYPE_FIDO_HYBRID_FLOW;
            case 8:
                return INVOCATION_TYPE_FIDO_TEST_PURPOSE;
            case 9:
                return INVOCATION_TYPE_MODULE_CREDMAN_PROVIDER;
            case 10:
                return INVOCATION_TYPE_CONDITIONAL_CREATE_CHROME_SYNC_KEY;
            case 11:
                return INVOCATION_TYPE_AUTHMOSIS_PASSKEY;
            default:
                return null;
        }
    }

    @Override // defpackage.evst
    public final int a() {
        return this.m;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.m);
    }
}
