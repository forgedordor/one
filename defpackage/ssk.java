package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import j$.util.function.Function$CC;
import java.io.FileNotFoundException;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ssk extends fcyz implements fdat {
    int a;
    final /* synthetic */ ssl b;
    final /* synthetic */ cayy c;
    final /* synthetic */ ssp d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ssk(fcxy fcxyVar, ssl sslVar, cayy cayyVar, ssp sspVar) {
        super(2, fcxyVar);
        this.b = sslVar;
        this.c = cayyVar;
        this.d = sspVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ssk) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object objK;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        try {
        } catch (FileNotFoundException e) {
            ssl sslVar = this.b;
            final ssp sspVar = this.d;
            this.a = 2;
            eksp ekspVar = ssm.a;
            ((eksl) ((eksl) ekspVar.j()).g(e)).q("Attempting retry.");
            final Uri uri = Uri.parse(sspVar.d);
            bsje bsjeVarC = PartsTable.c();
            bsjeVarC.A("FileAudioLevelsHandler#attemptRetryFileNotFound");
            bsjeVarC.h(new Function() { // from class: ssd
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj2) {
                    bsjl bsjlVar = (bsjl) obj2;
                    bsjlVar.n(bary.b(sspVar.c));
                    bsjlVar.x();
                    Uri uri2 = uri;
                    bsjlVar.z(uri2);
                    bsjlVar.q(uri2);
                    return bsjlVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            ekgb ekgbVarZ = bsjeVarC.b().z();
            ekgbVarZ.getClass();
            PartsTable.BindData bindData = (PartsTable.BindData) fcva.P(ekgbVarZ);
            if (bindData == null) {
                ((eksl) ekspVar.j()).q("Retry failed. No new content uri found.");
                objK = cbcw.k();
            } else {
                ((eksl) ekspVar.h()).t("Retrying, found new uri: %s", String.valueOf(bindData.t()));
                Uri uriT = bindData.t();
                uriT.getClass();
                objK = sslVar.a(uriT, sspVar, this);
            }
            if (objK == fcylVar) {
            }
        } catch (Exception e2) {
            ((eksl) ((eksl) ssm.a.j()).g(e2)).q("Work request failed.");
            objK = cbcw.k();
        }
        if (i == 0) {
            fctl.b(obj);
            ssl sslVar2 = this.b;
            if (!((Boolean) sslVar2.b.b()).booleanValue()) {
                ((eksl) ssm.a.h()).q("Work request failed. Waveform flag not enabled.");
                return cbcw.k();
            }
            ((eksl) ssm.a.h()).r("Attempt count: %d", ((caxm) this.c.a()).c);
            ssp sspVar2 = this.d;
            Uri uri2 = Uri.parse(sspVar2.d);
            uri2.getClass();
            this.a = 1;
            obj = sslVar2.a(uri2, sspVar2, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        } else {
            if (i != 1) {
                fctl.b(obj);
                return obj;
            }
            fctl.b(obj);
        }
        objK = (cbcw) obj;
        objK.getClass();
        return objK;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        ssk sskVar = new ssk(fcxyVar, this.b, this.c, this.d);
        sskVar.e = obj;
        return sskVar;
    }
}
