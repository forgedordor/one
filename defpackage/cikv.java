package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cikv {
    public static final boolean a(String str, String str2, bvdp bvdpVar) {
        if (str.isEmpty() && bvdpVar == bvdp.NAME_IS_AUTOMATIC) {
            return false;
        }
        return (!str.isEmpty() && bvdpVar == bvdp.NAME_IS_MANUAL && str.equals(str2)) ? false : true;
    }
}
