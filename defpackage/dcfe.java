package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcfe {
    public final dceu a;
    public final dcfd b;
    public final String c;

    public dcfe(String str, dceu dceuVar, dcfd dcfdVar) {
        dclh.n(dceuVar, "Cannot construct an Api with a null ClientBuilder");
        dclh.n(dcfdVar, "Cannot construct an Api with a null ClientKey");
        this.c = str;
        this.a = dceuVar;
        this.b = dcfdVar;
    }
}
