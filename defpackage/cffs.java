package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cffs implements cfrj {
    private final String b;
    private final fcsu d;
    private final ArrayList c = new ArrayList();
    public String a = "";
    private long e = 0;

    public cffs(fcsu fcsuVar, String str, Iterable iterable) {
        this.b = str;
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            ArrayList arrayList = this.c;
            ezok ezokVar = (ezok) ezol.a.createBuilder();
            ezokVar.copyOnWrite();
            ezol ezolVar = (ezol) ezokVar.instance;
            str2.getClass();
            ezolVar.c = str2;
            felm felmVar = felm.PHONE_NUMBER;
            ezokVar.copyOnWrite();
            ((ezol) ezokVar.instance).b = felmVar.a();
            arrayList.add((ezol) ezokVar.build());
        }
        this.d = fcsuVar;
    }

    @Override // defpackage.cfrj
    public final long a() {
        return this.e;
    }

    @Override // defpackage.cfrj
    public final cfrh b() {
        return new cfre(this.b);
    }

    @Override // defpackage.cfrj
    public final ListenableFuture c(ezpp ezppVar) {
        ezjs ezjsVar = (ezjs) ezjt.a.createBuilder();
        ezjsVar.copyOnWrite();
        ezjt ezjtVar = (ezjt) ezjsVar.instance;
        ezppVar.getClass();
        ezjtVar.c = ezppVar;
        ezjtVar.b |= 1;
        ezjsVar.a(this.c);
        ezid ezidVar = (ezid) ezie.a.createBuilder();
        ezidVar.copyOnWrite();
        ((ezie) ezidVar.instance).b = 2;
        ezjsVar.copyOnWrite();
        ezjt ezjtVar2 = (ezjt) ezjsVar.instance;
        ezie ezieVar = (ezie) ezidVar.build();
        ezieVar.getClass();
        ezjtVar2.f = ezieVar;
        ezjtVar2.b |= 4;
        this.a = ezppVar.c;
        return eork.i((ezjt) ezjsVar.build());
    }

    @Override // defpackage.cfrj
    public final /* bridge */ /* synthetic */ ListenableFuture d(cezv cezvVar, evuh evuhVar) {
        return cezvVar.d(cnln.b(((asqx) this.d.b()).c(this.b))).d((ezjt) evuhVar);
    }

    @Override // defpackage.cfrj
    public final /* bridge */ /* synthetic */ ListenableFuture e(evuh evuhVar) {
        long j;
        ezjv ezjvVar = (ezjv) evuhVar;
        if (ezjvVar != null) {
            ezpr ezprVar = ezjvVar.b;
            if (ezprVar == null) {
                ezprVar = ezpr.a;
            }
            j = ezprVar.b;
        } else {
            j = 0;
        }
        this.e = j;
        return eork.i(ezjvVar);
    }

    @Override // defpackage.cfrj
    public final String f() {
        return "RetrieveRegistrationIdHandler";
    }

    @Override // defpackage.cfrj
    public final String g() {
        return this.a;
    }

    @Override // defpackage.cfrj
    public final /* synthetic */ void h(Throwable th) {
        cfri.c(this);
    }

    @Override // defpackage.cfrj
    public final /* synthetic */ void i() {
        cfri.a(this);
    }

    @Override // defpackage.cfrj
    public final /* synthetic */ void j() {
        cfri.b(this);
    }

    @Override // defpackage.cfxa
    public final void k() {
    }

    @Override // defpackage.cfxa
    public final /* synthetic */ void l() {
    }
}
