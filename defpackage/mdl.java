package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mdl extends Exception {
    public final mdk a;

    public mdl(mdk mdkVar) {
        this("Unhandled input format:", mdkVar);
    }

    public mdl(String str, mdk mdkVar) {
        super(str + " " + String.valueOf(mdkVar));
        this.a = mdkVar;
    }
}
