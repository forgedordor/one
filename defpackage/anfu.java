package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class anfu extends fcyz implements fdat {
    int a;
    final /* synthetic */ anfw b;
    final /* synthetic */ Uri c;
    final /* synthetic */ amuy d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public anfu(anfw anfwVar, Uri uri, amuy amuyVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = anfwVar;
        this.c = uri;
        this.d = amuyVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((anfu) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            anfw anfwVar = this.b;
            Uri uri = this.c;
            fcyh fcyhVarA = eicg.a(anfwVar.a.hE());
            anft anftVar = new anft(null, anfwVar, uri);
            this.a = 1;
            obj = fdin.a(fcyhVarA, anftVar, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        if (((Number) obj).longValue() <= 0) {
            String[] strArr = PartsTable.a;
            bsjh bsjhVar = new bsjh();
            bsjhVar.ap("DefaultRbmMessageRepository#clearRichCardAttachmentOnPermanentFailure");
            bsjhVar.A();
            final Uri uri2 = this.c;
            final amuy amuyVar = this.d;
            bsjhVar.D(new Function() { // from class: anfs
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj2) {
                    bsjl bsjlVar = (bsjl) obj2;
                    bsjlVar.v(uri2);
                    bsjlVar.j(String.valueOf(anfw.V(amuyVar)));
                    return bsjlVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            bsjhVar.b().e();
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new anfu(this.b, this.c, this.d, fcxyVar);
    }
}
