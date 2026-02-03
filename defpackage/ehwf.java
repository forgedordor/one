package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehwf {
    public final eiba a;

    public ehwf(eiba eibaVar) {
        this.a = eibaVar;
    }

    public static ehwf a(String str) {
        eiaz eiazVar = (eiaz) eiba.a.createBuilder();
        eiazVar.copyOnWrite();
        eiba eibaVar = (eiba) eiazVar.instance;
        str.getClass();
        eibaVar.b |= 1;
        eibaVar.c = str;
        return new ehwf((eiba) eiazVar.build());
    }

    public final String b() {
        return this.a.c;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ehwf) && this.a.c.equals(((ehwf) obj).a.c);
    }

    public final int hashCode() {
        return this.a.c.hashCode();
    }

    public final String toString() {
        return String.format("SyncKey[name=%s]", b());
    }
}
