package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awmp {
    public final awpx a;
    public final awnc b;
    public final awnn c;
    public final awmv d;

    public awmp(awpx awpxVar, awnc awncVar, awnn awnnVar, awmv awmvVar) {
        awpxVar.getClass();
        awncVar.getClass();
        awnnVar.getClass();
        awmvVar.getClass();
        this.a = awpxVar;
        this.b = awncVar;
        this.c = awnnVar;
        this.d = awmvVar;
    }

    public static /* synthetic */ awmp c(awmp awmpVar, awnn awnnVar, awmv awmvVar, int i) {
        awpx awpxVar = (i & 1) != 0 ? awmpVar.a : null;
        awnc awncVar = (i & 2) != 0 ? awmpVar.b : null;
        if ((i & 4) != 0) {
            awnnVar = awmpVar.c;
        }
        awpxVar.getClass();
        awncVar.getClass();
        awnnVar.getClass();
        return new awmp(awpxVar, awncVar, awnnVar, awmvVar);
    }

    public final audu a() {
        awml awmlVar = ((awmt) this.d).b;
        if (awmlVar == null) {
            throw new IllegalStateException("RCS Group is not created yet, and does not have a conference URI");
        }
        audt audtVar = (audt) audu.a.createBuilder();
        audtVar.getClass();
        Object obj = this.b.b;
        obj.getClass();
        audtVar.copyOnWrite();
        audu auduVar = (audu) audtVar.instance;
        auduVar.b |= 1;
        auduVar.c = (String) obj;
        aubn aubnVar = (aubn) aubq.a.createBuilder();
        aubnVar.getClass();
        Object obj2 = awmlVar.b;
        obj2.getClass();
        aubr.b((String) obj2, aubnVar);
        aubr.c(aubp.GROUP, aubnVar);
        aubq aubqVarA = aubr.a(aubnVar);
        audtVar.copyOnWrite();
        audu auduVar2 = (audu) audtVar.instance;
        auduVar2.d = aubqVarA;
        auduVar2.b |= 2;
        evsn evsnVarBuild = audtVar.build();
        evsnVarBuild.getClass();
        return (audu) evsnVarBuild;
    }

    public final boolean b() {
        return fdbq.f(this.c, awnn.a) && fdbq.f(this.d, awmt.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof awmp)) {
            return false;
        }
        awmp awmpVar = (awmp) obj;
        return fdbq.f(this.a, awmpVar.a) && fdbq.f(this.b, awmpVar.b) && fdbq.f(this.c, awmpVar.c) && fdbq.f(this.d, awmpVar.d);
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "Group(token=" + this.a + ", groupId=" + this.b + ", members=" + this.c + ", details=" + this.d + ")";
    }
}
