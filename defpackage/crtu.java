package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crtu extends fcyz implements fdat {
    int a;
    final /* synthetic */ crtw b;
    final /* synthetic */ MessageCoreData c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public crtu(fcxy fcxyVar, crtw crtwVar, MessageCoreData messageCoreData) {
        super(2, fcxyVar);
        this.b = crtwVar;
        this.c = messageCoreData;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((crtu) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        MessageCoreData messageCoreDataW;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        if (i == 0) {
            fctl.b(obj);
            crtw crtwVar = this.b;
            messageCoreDataW = this.c;
            if (((bakt) crtwVar.c.b()).r(messageCoreDataW.A()) == null && (messageCoreDataW = ((baxe) crtwVar.b.b()).w(messageCoreDataW.C())) == null) {
                ekrw ekrwVarH = crtw.a.h();
                ekrwVarH.X(eksq.a, "BugleSpam");
                ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/util/spam/SpamPrechecker", "getUpdatedMessage", 83, "SpamPrechecker.kt")).q("Message deleted during spam precheck");
            }
            if (messageCoreDataW == null) {
                return null;
            }
            this.d = messageCoreDataW;
            this.a = 1;
            obj = crtwVar.b(messageCoreDataW, this);
            if (obj != fcylVar) {
            }
        }
        if (i != 1) {
            fctl.b(obj);
            return obj;
        }
        messageCoreDataW = (MessageCoreData) this.d;
        fctl.b(obj);
        csoc csocVar = (csoc) obj;
        if (csocVar == null) {
            return null;
        }
        crtw crtwVar2 = this.b;
        this.d = null;
        this.a = 2;
        Object objA = crtwVar2.a(messageCoreDataW, csocVar, this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        crtu crtuVar = new crtu(fcxyVar, this.b, this.c);
        crtuVar.d = obj;
        return crtuVar;
    }
}
