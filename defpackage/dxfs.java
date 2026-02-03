package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class dxfs {
    public static Object a(dxft dxftVar) {
        if (dxftVar instanceof dxfx) {
            return ((dxfx) dxftVar).a;
        }
        return null;
    }

    public static Object b(dxft dxftVar) throws Throwable {
        if (dxftVar instanceof dxfx) {
            return ((dxfx) dxftVar).a;
        }
        if (dxftVar instanceof dxfo) {
            throw ((dxfo) dxftVar).a();
        }
        throw new fctg();
    }

    public static String c(dxft dxftVar) {
        if (dxftVar instanceof dxfx) {
            return "SUCCESS";
        }
        if (dxftVar instanceof dxfz) {
            return "TRANSIENT_FAILURE";
        }
        if (dxftVar instanceof dxfw) {
            return "PERMANENT_FAILURE";
        }
        throw new fctg();
    }

    public static Throwable d(dxft dxftVar) {
        if (dxftVar instanceof dxfx) {
            return null;
        }
        if (dxftVar instanceof dxfo) {
            return ((dxfo) dxftVar).a();
        }
        throw new fctg();
    }

    public static int e(dxft dxftVar) {
        if (dxftVar instanceof dxfx) {
            return 0;
        }
        if (dxftVar instanceof dxfo) {
            return ((dxfo) dxftVar).b();
        }
        throw new fctg();
    }
}
