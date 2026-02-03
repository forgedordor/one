package defpackage;

import com.google.android.gms.kids.IndividualContactRequest;
import com.google.android.gms.kids.TrustedContactsRequest;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdoh extends fcyz implements fdat {
    int a;
    final /* synthetic */ cdoj b;
    final /* synthetic */ IndividualContactRequest[] c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cdoh(fcxy fcxyVar, cdoj cdojVar, IndividualContactRequest[] individualContactRequestArr) {
        super(2, fcxyVar);
        this.b = cdojVar;
        this.c = individualContactRequestArr;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cdoh) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        ddhv ddhvVar = (ddhv) this.b.d.b();
        TrustedContactsRequest trustedContactsRequest = new TrustedContactsRequest();
        trustedContactsRequest.a = this.c;
        defn defnVarD = ddhvVar.d(trustedContactsRequest);
        this.a = 1;
        Object objA = febo.a(defnVarD, this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cdoh cdohVar = new cdoh(fcxyVar, this.b, this.c);
        cdohVar.d = obj;
        return cdohVar;
    }
}
