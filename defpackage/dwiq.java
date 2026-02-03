package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dwiq extends dwpk {
    public final String a;
    public final String b;
    public final dwpj c;
    public final ejwi d;

    public dwiq(String str, String str2, dwpj dwpjVar, ejwi ejwiVar) {
        if (str == null) {
            throw new NullPointerException("Null id");
        }
        this.a = str;
        if (str2 == null) {
            throw new NullPointerException("Null tachyonAppName");
        }
        this.b = str2;
        if (dwpjVar == null) {
            throw new NullPointerException("Null type");
        }
        this.c = dwpjVar;
        if (ejwiVar == null) {
            throw new NullPointerException("Null handlerId");
        }
        this.d = ejwiVar;
    }

    @Override // defpackage.dwpk
    public final dwpg a() {
        return new dwip(this);
    }

    @Override // defpackage.dwpk
    public final dwpj b() {
        return this.c;
    }

    @Override // defpackage.dwpk
    public final ejwi c() {
        return this.d;
    }

    @Override // defpackage.dwpk
    public final String d() {
        return this.a;
    }

    @Override // defpackage.dwpk
    public final String e() {
        return this.b;
    }

    public final String toString() {
        ejwi ejwiVar = this.d;
        return "ContactId{id=" + this.a + ", tachyonAppName=" + this.b + ", type=" + this.c.toString() + ", handlerId=" + ejwiVar.toString() + "}";
    }
}
