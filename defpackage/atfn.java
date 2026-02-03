package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.MessagePartData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import j$.util.Collection;
import j$.util.Comparator;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class atfn extends fcyz implements fdat {
    final /* synthetic */ atfx a;
    final /* synthetic */ athh b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public atfn(fcxy fcxyVar, atfx atfxVar, athh athhVar) {
        super(2, fcxyVar);
        this.a = atfxVar;
        this.b = athhVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((atfn) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        MessagePartData messagePartDataE;
        fctl.b(obj);
        baxe baxeVar = (baxe) this.a.d.b();
        eieu eieuVarK = eiiy.k("MessageDatabaseOperations#readMessageAndParts-processingId");
        final athh athhVar = this.b;
        try {
            ecem.b();
            bbae bbaeVar = (bbae) baxeVar.f.b();
            eieu eieuVarK2 = eiiy.k("MessagePartDatabaseOperations#readMessagePartData-processingId");
            try {
                bsje bsjeVarC = PartsTable.c();
                bsjeVarC.A("readMessagePartData-processingId");
                bsjeVarC.s();
                bsjeVarC.h(new Function() { // from class: bbaa
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        bsjl bsjlVar = (bsjl) obj2;
                        int iIntValue = PartsTable.e().intValue();
                        if (iIntValue < 60080) {
                            dqru.x("processing_id", iIntValue);
                        }
                        bsjlVar.ap(new dqpj("parts.processing_id", 1, athg.b(athhVar)));
                        return bsjlVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                Optional optionalMax = Collection.EL.stream(bsjeVarC.b().z()).max(Comparator.CC.comparing(new Function() { // from class: bbab
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return ((PartsTable.BindData) obj2).K();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }));
                MessageCoreData messageCoreData = null;
                if (optionalMax.isEmpty()) {
                    eieuVarK2.close();
                    messagePartDataE = null;
                } else {
                    messagePartDataE = ((bahv) bbaeVar.a.b()).e((PartsTable.BindData) optionalMax.get());
                    eieuVarK2.close();
                }
                if (messagePartDataE == null) {
                    ekrd ekrdVarK = baxe.a.k();
                    ekrdVarK.X(coie.j, athhVar);
                    ((ekrd) ekrdVarK.h("com/google/android/apps/messaging/shared/datamodel/data/message/MessageDatabaseOperations", "readMessageAndParts", 205, "MessageDatabaseOperations.java")).q("Message part not found for processingId.");
                } else {
                    MessageCoreData messageCoreDataA = baxeVar.A(messagePartDataE.B());
                    if (messageCoreDataA == null) {
                        ekrd ekrdVarK2 = baxe.a.k();
                        ekrdVarK2.X(coie.j, athhVar);
                        ((ekrd) ekrdVarK2.h("com/google/android/apps/messaging/shared/datamodel/data/message/MessageDatabaseOperations", "readMessageAndParts", 213, "MessageDatabaseOperations.java")).q("Message not found for part with processingId.");
                    } else {
                        messageCoreDataA.aM(messagePartDataE);
                        messageCoreData = messageCoreDataA;
                    }
                }
                eieuVarK.close();
                return messageCoreData;
            } finally {
            }
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        atfn atfnVar = new atfn(fcxyVar, this.a, this.b);
        atfnVar.c = obj;
        return atfnVar;
    }
}
