package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class bxh {
    static int d(int i) {
        return i != 1 ? 0 : 1;
    }

    public static bxg e() {
        bwq bwqVar = new bwq();
        bwqVar.c();
        bwqVar.a = bwi.d().a();
        bwqVar.d(cax.e().a());
        return bwqVar;
    }

    public static String f(int i) {
        return i != 1 ? "audio/mp4a-latm" : "audio/vorbis";
    }

    public abstract int a();

    public abstract bwi b();

    public abstract cax c();
}
