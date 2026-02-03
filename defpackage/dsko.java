package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dsko implements ecnq {
    @Override // defpackage.ecnq
    public final void a(ecoa ecoaVar) throws InterruptedException {
        ecnw ecnwVar = new ecnw();
        ecnwVar.b("INSERT INTO chime_versioned_identifiers");
        ecnwVar.b("(");
        ecnwVar.b("account");
        ecnwVar.b(",key");
        ecnwVar.b(",value");
        ecnwVar.b(")");
        ecnwVar.b("SELECT ");
        ecnwVar.b("promotions.account");
        ecnwVar.b(", ");
        ecnwVar.b("chime_versioned_identifiers.key");
        ecnwVar.b(", ");
        ecnwVar.b("chime_versioned_identifiers.value");
        ecnwVar.b(" FROM ");
        ecnwVar.b("chime_versioned_identifiers, promotions");
        ecnwVar.b(" WHERE ");
        ecnwVar.b("promotions.key");
        ecnwVar.b(" = ");
        ecnwVar.b("chime_versioned_identifiers.key");
        ecoaVar.g(ecnwVar.a());
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        sb.append("account = ?");
        arrayList.add("noaccount");
        ecoaVar.a(ecnu.a("chime_versioned_identifiers", sb, arrayList));
        ecnw ecnwVar2 = new ecnw();
        ecnwVar2.b("INSERT INTO versioned_identifiers");
        ecnwVar2.b("(");
        ecnwVar2.b("account");
        ecnwVar2.b(",key");
        ecnwVar2.b(",value");
        ecnwVar2.b(")");
        ecnwVar2.b("SELECT ");
        ecnwVar2.b("promotions.account");
        ecnwVar2.b(", ");
        ecnwVar2.b("versioned_identifiers.key");
        ecnwVar2.b(", ");
        ecnwVar2.b("versioned_identifiers.value");
        ecnwVar2.b(" FROM ");
        ecnwVar2.b("versioned_identifiers, promotions");
        ecnwVar2.b(" WHERE ");
        ecnwVar2.b("promotions.key");
        ecnwVar2.b(" = ");
        ecnwVar2.b("versioned_identifiers.key");
        ecoaVar.g(ecnwVar2.a());
        StringBuilder sb2 = new StringBuilder();
        ArrayList arrayList2 = new ArrayList();
        sb2.append("account = ?");
        arrayList2.add("noaccount");
        ecoaVar.a(ecnu.a("versioned_identifiers", sb2, arrayList2));
    }
}
