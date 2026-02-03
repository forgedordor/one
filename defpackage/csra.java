package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csra extends fcyz implements fdat {
    int a;
    final /* synthetic */ felv b;
    final /* synthetic */ ParticipantsTable.BindData c;
    final /* synthetic */ csrb d;
    final /* synthetic */ csoc e;
    final /* synthetic */ List f;
    final /* synthetic */ csrn g;
    final /* synthetic */ eykc h;
    Object i;
    final /* synthetic */ cspj j;
    private /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public csra(fcxy fcxyVar, felv felvVar, ParticipantsTable.BindData bindData, csrb csrbVar, csoc csocVar, List list, csrn csrnVar, cspj cspjVar, eykc eykcVar) {
        super(2, fcxyVar);
        this.b = felvVar;
        this.c = bindData;
        this.d = csrbVar;
        this.e = csocVar;
        this.f = list;
        this.g = csrnVar;
        this.j = cspjVar;
        this.h = eykcVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((csra) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00de A[PHI: r0 r1 r2
      0x00de: PHI (r0v17 ezsn) = (r0v34 ezsn), (r0v35 ezsn) binds: [B:39:0x00dc, B:13:0x0024] A[DONT_GENERATE, DONT_INLINE]
      0x00de: PHI (r1v6 csql) = (r1v5 csql), (r1v14 csql) binds: [B:39:0x00dc, B:13:0x0024] A[DONT_GENERATE, DONT_INLINE]
      0x00de: PHI (r2v11 java.lang.Object) = (r2v10 java.lang.Object), (r2v19 java.lang.Object) binds: [B:39:0x00dc, B:13:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0144  */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.io.Closeable] */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.csra.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        csra csraVar = new csra(fcxyVar, this.b, this.c, this.d, this.e, this.f, this.g, this.j, this.h);
        csraVar.k = obj;
        return csraVar;
    }
}
