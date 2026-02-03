package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amkf extends fcyz implements fdat {
    int a;
    final /* synthetic */ amkh b;
    final /* synthetic */ MessageIdType c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amkf(fcxy fcxyVar, amkh amkhVar, MessageIdType messageIdType) {
        super(2, fcxyVar);
        this.b = amkhVar;
        this.c = messageIdType;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((amkf) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            String[] strArr = bqcn.a;
            bqcc bqccVar = new bqcc();
            MessageIdType messageIdType = this.c;
            bqccVar.c(new amkg(messageIdType));
            ekgb ekgbVarA = bqccVar.b().a();
            int size = ekgbVarA.size();
            if (size != 1) {
                ((ekrd) amkh.a.j().h("com/google/android/apps/messaging/shared/api/messaging/message/classification/ClassificationControllerImpl$removeClassification$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 91, "ClassificationControllerImpl.kt")).r("%d classifications deleted when attempting to delete single classification", size);
                return fctx.a;
            }
            amkh amkhVar = this.b;
            crbi crbiVar = (crbi) amkhVar.b.b();
            ezgd ezgdVarK = ((bqbg) ekgbVarA.get(0)).k();
            ezgdVarK.getClass();
            elpn elpnVar = elpn.DISMISS;
            this.a = 1;
            if (crbiVar.g(messageIdType, amkhVar.c.a, ezgdVarK, elpnVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        amkf amkfVar = new amkf(fcxyVar, this.b, this.c);
        amkfVar.d = obj;
        return amkfVar;
    }
}
