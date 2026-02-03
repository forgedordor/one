package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aasq implements cfrj {
    private final ewsk a;
    private final String b = UUID.randomUUID().toString();
    private String c;
    private long d;

    public aasq(ewsk ewskVar) {
        this.a = ewskVar;
    }

    @Override // defpackage.cfrj
    public final long a() {
        return this.d;
    }

    @Override // defpackage.cfrj
    public final cfrh b() {
        return cfrh.d;
    }

    @Override // defpackage.cfrj
    public final /* bridge */ /* synthetic */ ListenableFuture c(ezpp ezppVar) {
        this.c = ezppVar.c;
        ezjk ezjkVar = (ezjk) ezjl.a.createBuilder();
        ezjkVar.copyOnWrite();
        ezjl ezjlVar = (ezjl) ezjkVar.instance;
        ezppVar.getClass();
        ezjlVar.f = ezppVar;
        ezjlVar.b |= 4;
        ezok ezokVar = (ezok) ezol.a.createBuilder();
        felm felmVar = felm.MESSAGES_DATA_DONATION;
        ezokVar.copyOnWrite();
        ((ezol) ezokVar.instance).b = felmVar.a();
        ezokVar.copyOnWrite();
        ((ezol) ezokVar.instance).c = "dds";
        ezokVar.copyOnWrite();
        ((ezol) ezokVar.instance).d = "Bugle";
        ezjkVar.copyOnWrite();
        ezjl ezjlVar2 = (ezjl) ezjkVar.instance;
        ezol ezolVar = (ezol) ezokVar.build();
        ezolVar.getClass();
        ezjlVar2.c = ezolVar;
        ezjlVar2.b |= 1;
        ezjg ezjgVar = (ezjg) ezjj.a.createBuilder();
        ezjgVar.copyOnWrite();
        ezjj ezjjVar = (ezjj) ezjgVar.instance;
        String str = this.b;
        str.getClass();
        ezjjVar.c = str;
        ezjh ezjhVar = ezjh.USER;
        ezjgVar.copyOnWrite();
        ((ezjj) ezjgVar.instance).k = ezjhVar.a();
        ezji ezjiVar = ezji.MESSAGES_DATA_DONATION;
        ezjgVar.copyOnWrite();
        ((ezjj) ezjgVar.instance).d = ezjiVar.a();
        evqs byteString = this.a.toByteString();
        ezjgVar.copyOnWrite();
        ((ezjj) ezjgVar.instance).e = byteString;
        ezjkVar.copyOnWrite();
        ezjl ezjlVar3 = (ezjl) ezjkVar.instance;
        ezjj ezjjVar2 = (ezjj) ezjgVar.build();
        ezjjVar2.getClass();
        ezjlVar3.e = ezjjVar2;
        ezjlVar3.b |= 2;
        return eijx.e((ezjl) ezjkVar.build());
    }

    @Override // defpackage.cfrj
    public final /* bridge */ /* synthetic */ ListenableFuture d(cezv cezvVar, evuh evuhVar) {
        return cezvVar.a().e((ezjl) evuhVar);
    }

    @Override // defpackage.cfrj
    public final /* bridge */ /* synthetic */ ListenableFuture e(evuh evuhVar) {
        long j;
        ezjn ezjnVar = (ezjn) evuhVar;
        if (ezjnVar == null) {
            j = 0;
        } else {
            ezpr ezprVar = ezjnVar.b;
            if (ezprVar == null) {
                ezprVar = ezpr.a;
            }
            j = ezprVar.b;
        }
        this.d = j;
        return eijx.e(ezjnVar);
    }

    @Override // defpackage.cfrj
    public final String f() {
        return "DonationRpcHandler";
    }

    @Override // defpackage.cfrj
    public final String g() {
        return this.c;
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
