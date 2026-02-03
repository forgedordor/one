package defpackage;

import android.content.Context;
import com.google.android.ims.provisioning.config.InstantMessageConfiguration;
import com.google.android.ims.rcsservice.filetransfer.FileTransferInfo;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dffx {
    public static final dfny a = dfnv.b("read_http_request_executor_factory_from_provider");
    public final dfgc b;
    public final deyc c;
    public final dffz d;
    private final dffp e;
    private final dfim f;
    private final dfgt g;
    private final dfgv h;
    private final dfgv i;
    private final fcsu j;
    private final fcsu k;

    public dffx(dfgc dfgcVar, dffp dffpVar, dfim dfimVar, deyc deycVar, dfgt dfgtVar, dfgv dfgvVar, dfgv dfgvVar2, fcsu fcsuVar, fcsu fcsuVar2, dffz dffzVar) {
        this.b = dfgcVar;
        this.e = dffpVar;
        this.f = dfimVar;
        this.c = deycVar;
        this.d = dffzVar;
        this.h = dfgvVar;
        this.i = dfgvVar2;
        this.j = fcsuVar;
        this.k = fcsuVar2;
        this.g = dfgtVar;
    }

    private final dfgv e() {
        return ((Boolean) a.a()).booleanValue() ? (dfgv) this.j.b() : this.h;
    }

    public final dffo a(long j, String str, InstantMessageConfiguration instantMessageConfiguration, dfif dfifVar, String str2, Optional optional, int i) {
        deyb deybVar = new deyb(this.c, str, 2);
        dfgs dfgsVarA = this.g.a(deybVar, e().a(instantMessageConfiguration, deybVar));
        dffp dffpVar = this.e;
        fcsu fcsuVar = dffpVar.a;
        String strA = this.d.a();
        Context context = (Context) fcsuVar.b();
        dfdv dfdvVar = (dfdv) dffpVar.b.b();
        dgfu dgfuVar = (dgfu) dffpVar.c.b();
        str.getClass();
        instantMessageConfiguration.getClass();
        str2.getClass();
        optional.getClass();
        return new dffo(context, dfdvVar, dgfuVar, dffpVar.e, dfgsVarA, j, str, instantMessageConfiguration, dfifVar, str2, optional, i, deybVar, strA);
    }

    public final dfgb b(long j, String str, String str2, FileTransferInfo fileTransferInfo, InstantMessageConfiguration instantMessageConfiguration, dfif dfifVar) {
        deyb deybVarD = this.c.d(false, str);
        return this.b.a(j, str, str2, fileTransferInfo, instantMessageConfiguration, dfifVar, false, deybVarD, c().a(instantMessageConfiguration, deybVarD), this.d.b());
    }

    public final dfgv c() {
        return ((Boolean) a.a()).booleanValue() ? (dfgv) this.k.b() : this.i;
    }

    public final dfil d(long j, String str, InstantMessageConfiguration instantMessageConfiguration, dfif dfifVar, String str2, int i) {
        deyb deybVar = new deyb(this.c, str, 6);
        dfgs dfgsVarA = this.g.a(deybVar, e().a(instantMessageConfiguration, deybVar));
        dfim dfimVar = this.f;
        fcsu fcsuVar = dfimVar.a;
        String strA = this.d.a();
        Context context = (Context) fcsuVar.b();
        str.getClass();
        instantMessageConfiguration.getClass();
        dfdv dfdvVar = (dfdv) dfimVar.b.b();
        str2.getClass();
        return new dfil(context, dfgsVarA, j, str, instantMessageConfiguration, dfifVar, dfdvVar, str2, i, deybVar, strA, dfimVar.d);
    }
}
