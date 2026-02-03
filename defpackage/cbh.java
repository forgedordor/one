package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class cbh {
    public abstract cbi a();

    public final cbi b() {
        cbi cbiVarA = a();
        cci cciVar = (cci) cbiVarA;
        int i = cciVar.b;
        int i2 = cciVar.c;
        String strConcat = i == -1 ? " audioSource" : "";
        if (i2 <= 0) {
            strConcat = strConcat.concat(" captureSampleRate");
        }
        if (cciVar.d <= 0) {
            strConcat = strConcat.concat(" encodeSampleRate");
        }
        if (cciVar.e <= 0) {
            strConcat = strConcat.concat(" channelCount");
        }
        if (cciVar.f == -1) {
            strConcat = strConcat.concat(" audioFormat");
        }
        if (strConcat.isEmpty()) {
            return cbiVarA;
        }
        throw new IllegalArgumentException("Required settings missing or non-positive:".concat(strConcat));
    }

    public abstract void c(int i);

    public abstract void d(int i);

    public abstract void e(int i);

    public abstract void f(int i);

    public abstract void g(int i);
}
