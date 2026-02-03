package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import google.internal.communications.instantmessaging.v1.TachyonCommon$PublicPreKeySets;
import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwlr implements cfrj {
    private final TachyonCommon$PublicPreKeySets a;
    private final String b;
    private String c = "";
    private long d = 0;

    public bwlr(TachyonCommon$PublicPreKeySets tachyonCommon$PublicPreKeySets, String str) {
        this.a = tachyonCommon$PublicPreKeySets;
        this.b = str;
    }

    @Override // defpackage.cfrj
    public final long a() {
        return this.d;
    }

    @Override // defpackage.cfrj
    public final cfrh b() {
        return new cfre(this.b);
    }

    @Override // defpackage.cfrj
    public final ListenableFuture c(ezpp ezppVar) {
        ezwf ezwfVar = (ezwf) ezwg.a.createBuilder();
        ezwfVar.copyOnWrite();
        ezwg ezwgVar = (ezwg) ezwfVar.instance;
        ezppVar.getClass();
        ezwgVar.c = ezppVar;
        ezwgVar.b |= 1;
        ezwfVar.copyOnWrite();
        ezwg ezwgVar2 = (ezwg) ezwfVar.instance;
        TachyonCommon$PublicPreKeySets tachyonCommon$PublicPreKeySets = this.a;
        tachyonCommon$PublicPreKeySets.getClass();
        ezwgVar2.d = tachyonCommon$PublicPreKeySets;
        ezwgVar2.b |= 2;
        ezwg ezwgVar3 = (ezwg) ezwfVar.build();
        this.c = ezppVar.c;
        return eork.i(ezwgVar3);
    }

    @Override // defpackage.cfrj
    public final /* bridge */ /* synthetic */ ListenableFuture d(cezv cezvVar, evuh evuhVar) {
        ezok ezokVar = (ezok) ezol.a.createBuilder();
        ezokVar.copyOnWrite();
        ((ezol) ezokVar.instance).c = this.b;
        return cezvVar.d((ezol) ezokVar.build()).g((ezwg) evuhVar);
    }

    @Override // defpackage.cfrj
    public final /* synthetic */ ListenableFuture e(evuh evuhVar) {
        long j;
        ezwi ezwiVar = (ezwi) evuhVar;
        if (ezwiVar != null) {
            ezpr ezprVar = ezwiVar.b;
            if (ezprVar == null) {
                ezprVar = ezpr.a;
            }
            j = ezprVar.b;
        } else {
            j = 0;
        }
        this.d = j;
        eoqt eoqtVarT = eoqt.t(eork.i(ezwiVar));
        ejvr ejvrVar = new ejvr() { // from class: bwlp
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return Status.b;
            }
        };
        eoqg eoqgVar = eoqg.a;
        return eooh.f(eooq.f(eoqtVarT, ejvrVar, eoqgVar), Throwable.class, new ejvr() { // from class: bwlq
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return Status.c((Throwable) obj);
            }
        }, eoqgVar);
    }

    @Override // defpackage.cfrj
    public final String f() {
        return "UploadPreKeysHandler";
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
