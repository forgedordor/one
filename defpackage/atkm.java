package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class atkm extends fcyz implements fdat {
    final /* synthetic */ athh a;
    final /* synthetic */ boolean b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public atkm(athh athhVar, boolean z, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = athhVar;
        this.b = z;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((atkm) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Boolean boolValueOf;
        fctl.b(obj);
        String[] strArr = atmx.a;
        atlj atljVar = new atlj();
        final athh athhVar = this.a;
        atljVar.e(athhVar);
        atljVar.c(atmy.a);
        boolean zP = atljVar.a().p(new Function() { // from class: atkk
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                atmw atmwVar = (atmw) obj2;
                atmwVar.c(athhVar);
                atmwVar.b(atmy.a);
                return atmwVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        if (this.b) {
            atlj atljVar2 = new atlj();
            atljVar2.e(athhVar);
            atljVar2.c(atmy.b);
            boolValueOf = Boolean.valueOf(atljVar2.a().p(new Function() { // from class: atkl
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj2) {
                    atmw atmwVar = (atmw) obj2;
                    atmwVar.c(athhVar);
                    atmwVar.b(atmy.b);
                    return atmwVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }));
        } else {
            boolValueOf = null;
        }
        ekrw ekrwVarH = atkz.a.h();
        ekrwVarH.X(eksq.a, "BugleFileTransfer");
        ekrd ekrdVar = (ekrd) ekrwVarH;
        ekrdVar.X(coie.j, athhVar);
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/processing/database/FileProcessingDatabaseOperationsImpl$addEntry$2", "invokeSuspend", 86, "FileProcessingDatabaseOperationsImpl.kt")).G("Added file processing table entry for full file (%s) and thumbnail (%s).", zP, boolValueOf);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new atkm(this.a, this.b, fcxyVar);
    }
}
