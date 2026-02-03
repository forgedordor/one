package defpackage;

import android.content.ContentValues;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.VmtTable;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class svs extends fcyz implements fdat {
    final /* synthetic */ svu a;
    final /* synthetic */ aoog b;
    final /* synthetic */ aonp c;
    final /* synthetic */ Locale d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public svs(fcxy fcxyVar, svu svuVar, aoog aoogVar, aonp aonpVar, Locale locale) {
        super(2, fcxyVar);
        this.a = svuVar;
        this.b = aoogVar;
        this.c = aonpVar;
        this.d = locale;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((svs) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        String[] strArr = VmtTable.a;
        bvcc bvccVar = new bvcc();
        aoog aoogVar = this.b;
        bvccVar.c(aoogVar.c);
        bvccVar.e(this.c);
        bvccVar.b(this.d.toLanguageTag());
        final VmtTable.BindData bindDataA = bvccVar.a();
        final bvdb bvdbVar = new bvdb((bvdc) new svt(aoogVar).apply(new bvdc()));
        final dqsy dqsyVarC = VmtTable.c();
        ((Boolean) dqsyVarC.o(new ejxr() { // from class: bvby
            @Override // defpackage.ejxr
            public final Object get() {
                String[] strArr2 = VmtTable.a;
                bvda bvdaVar = new bvda();
                ContentValues contentValues = bvdaVar.a;
                VmtTable.BindData bindData = bindDataA;
                dqru.v(contentValues, "part_id", bindData.n());
                bvdaVar.d(bindData.k());
                bvdaVar.c(bindData.o());
                dqru.v(contentValues, "locale", bindData.m());
                bvdaVar.al();
                bvdaVar.af(bvdbVar);
                bvdaVar.an(new dqsb("vmt", "-updateOrInsert-update"));
                if (bvdaVar.b().e() != 0) {
                    return true;
                }
                final dqsy dqsyVar = dqsyVarC;
                return Boolean.valueOf(dqru.b(VmtTable.c(), "vmt", bindData, new Function() { // from class: bvbw
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return Long.valueOf(dqsyVar.O("vmt", (dqst) obj2));
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }, new Consumer() { // from class: bvbx
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj2) {
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                }) != -1);
            }
        })).booleanValue();
        this.a.f.l(aoogVar.a, aoogVar.b, new String[0]);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        svs svsVar = new svs(fcxyVar, this.a, this.b, this.c, this.d);
        svsVar.e = obj;
        return svsVar;
    }
}
