package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqmg {
    public static final elhc a(String str) {
        return le.m(str) ? elhc.IMAGE : le.z(str) ? elhc.VIDEO : le.f(str) ? elhc.AUDIO : le.y(str) ? elhc.VCARD : le.w(str) ? elhc.TEXT : le.q(str) ? elhc.PDF : le.g(str) ? elhc.CALENDAR : le.x(str) ? elhc.TXT : le.h(str) ? elhc.DOC : le.r(str) ? elhc.PPT : le.A(str) ? elhc.XLS : le.l(str) ? elhc.HTML : ("application/vnd.android.package-archive".equals(str) || "application/zip".equals(str) || "application/java-archive".equals(str)) ? elhc.COMPRESSED : (aqzl.a() && str.equals("application/xml")) ? elhc.APPLICATION_XML : (aqzl.a() && str.equals("application/rtf")) ? elhc.APPLICATION_RTF : (aqzl.a() && str.equals("application/json")) ? elhc.APPLICATION_JSON : (aqzl.a() && str.equals("application/binary")) ? elhc.APPLICATION_BINARY : (aqzl.a() && str.startsWith("application/")) ? elhc.APPLICATION : elhc.UNKNOWN_BUGLE_CONTENT_TYPE;
    }
}
