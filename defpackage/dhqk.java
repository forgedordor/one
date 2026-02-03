package defpackage;

import com.google.android.libraries.abuse.hades.moirai.download.PersephoneDownloadWorker;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhqk extends fcyz implements fdat {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ PersephoneDownloadWorker c;
    final /* synthetic */ dhqv d;
    final /* synthetic */ dhnv e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dhqk(PersephoneDownloadWorker persephoneDownloadWorker, dhqv dhqvVar, dhnv dhnvVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = persephoneDownloadWorker;
        this.d = dhqvVar;
        this.e = dhnvVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dhqk) c((etqc) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        etqc etqcVar = (etqc) this.b;
        PersephoneDownloadWorker persephoneDownloadWorker = this.c;
        dhqv dhqvVar = this.d;
        byte[] bArr = dhqvVar.b;
        evqs evqsVar = dhqvVar.c;
        boolean z = dhqvVar.d;
        String str = dhqvVar.e;
        etqcVar.getClass();
        dhqv dhqvVar2 = new dhqv(etqcVar, bArr);
        dhnv dhnvVar = this.e;
        this.a = 1;
        Object objL = persephoneDownloadWorker.l(dhqvVar2, dhnvVar, this);
        return objL == fcylVar ? fcylVar : objL;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        dhqk dhqkVar = new dhqk(this.c, this.d, this.e, fcxyVar);
        dhqkVar.b = obj;
        return dhqkVar;
    }
}
