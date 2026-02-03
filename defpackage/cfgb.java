package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfgb implements cfrj {
    private final byte[] a;
    private final ezol b;
    private String c = "";
    private long d = 0;

    public cfgb(byte[] bArr, ezol ezolVar) {
        this.a = bArr;
        this.b = ezolVar;
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
    public final ListenableFuture c(ezpp ezppVar) {
        this.c = ezppVar.c;
        ezmm ezmmVar = (ezmm) ezmn.a.createBuilder();
        ezmmVar.copyOnWrite();
        ezmn ezmnVar = (ezmn) ezmmVar.instance;
        ezppVar.getClass();
        ezmnVar.c = ezppVar;
        ezmnVar.b |= 1;
        evqs evqsVarX = evqs.x(this.a);
        ezmmVar.copyOnWrite();
        ((ezmn) ezmmVar.instance).d = evqsVarX;
        ezmmVar.copyOnWrite();
        ezmn ezmnVar2 = (ezmn) ezmmVar.instance;
        ezol ezolVar = this.b;
        ezolVar.getClass();
        ezmnVar2.e = ezolVar;
        ezmnVar2.b |= 2;
        return eork.i((ezmn) ezmmVar.build());
    }

    @Override // defpackage.cfrj
    public final /* bridge */ /* synthetic */ ListenableFuture d(cezv cezvVar, evuh evuhVar) {
        ezmn ezmnVar = (ezmn) evuhVar;
        eyyh eyyhVarA = cezvVar.c.a();
        fbnd fbndVar = eyyhVarA.a;
        fbrk fbrkVarA = eyyi.d;
        if (fbrkVarA == null) {
            synchronized (eyyi.class) {
                fbrkVarA = eyyi.d;
                if (fbrkVarA == null) {
                    fbrh fbrhVarA = fbrk.a();
                    fbrhVarA.c = fbrj.UNARY;
                    fbrhVarA.d = fbrk.c("google.internal.communications.instantmessaging.v1.Pairing", "SetCloudStoreEncryptionKey");
                    fbrhVarA.b();
                    ezmn ezmnVar2 = ezmn.a;
                    evrr evrrVar = fcrj.a;
                    fbrhVarA.a = new fcrh(ezmnVar2);
                    fbrhVarA.b = new fcrh(ezmp.a);
                    fbrkVarA = fbrhVarA.a();
                    eyyi.d = fbrkVarA;
                }
            }
        }
        return fcrw.a(fbndVar.a(fbrkVarA, eyyhVarA.b), ezmnVar);
    }

    @Override // defpackage.cfrj
    public final /* bridge */ /* synthetic */ ListenableFuture e(evuh evuhVar) {
        ezmp ezmpVar = (ezmp) evuhVar;
        if (ezmpVar == null) {
            return eork.h(new IllegalArgumentException("Set Cloud Store encryption key response is null"));
        }
        ezpr ezprVar = ezmpVar.b;
        if (ezprVar == null) {
            ezprVar = ezpr.a;
        }
        this.d = ezprVar.b;
        return eork.i(true);
    }

    @Override // defpackage.cfrj
    public final String f() {
        return "SetCloudStoreEncryptionKeyRpcHandler";
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
