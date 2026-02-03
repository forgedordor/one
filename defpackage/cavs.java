package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cavs extends fcyz implements fdau {
    int a;
    final /* synthetic */ cavv b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cavs(cavv cavvVar, fcxy fcxyVar) {
        super(3, fcxyVar);
        this.b = cavvVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        cavs cavsVar = new cavs(this.b, (fcxy) obj3);
        cavsVar.c = (cavz) obj;
        return cavsVar.b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object objI;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        Object obj2 = this.c;
        cavv cavvVar = this.b;
        obj2.getClass();
        this.a = 1;
        cavz cavzVar = (cavz) obj2;
        String str = cavzVar.c;
        str.getClass();
        if (str.length() <= 0) {
            throw new IllegalArgumentException("RcsMessageId is empty in work handler.");
        }
        MessageCoreData messageCoreDataX = ((baxe) cavvVar.b.b()).x(basd.a(cavzVar.c));
        messageCoreDataX.getClass();
        int i2 = cavzVar.d;
        int iB = cavy.b(i2);
        if (iB == 0) {
            iB = 1;
        }
        int i3 = iB - 2;
        if (i3 == 1) {
            long j = cavzVar.e;
            alwl alwlVar = cavzVar.f;
            if (alwlVar == null) {
                alwlVar = alwl.a;
            }
            alwlVar.getClass();
            if (((chvp) cavvVar.a.b()).d(messageCoreDataX, j, ((alre) cavvVar.c.b()).b(alwlVar), cavzVar.g, cavzVar.h) == null) {
                ekrw ekrwVarJ = cavw.a.j();
                ekrwVarJ.X(eksq.a, "BugleFileTransfer");
                ekrd ekrdVar = (ekrd) ekrwVarJ;
                ekrdVar.X(cqnc.b, messageCoreDataX.C());
                ekrdVar.X(cqnc.f, messageCoreDataX.F());
                ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/datamodel/workhandlers/RcsToTelephonySyncHandler$RcsToTelephonySyncHandlerInternal", "updateIncomingRcsTextMessageInTelephony", 144, "RcsToTelephonySyncHandler.kt")).q("Failed to update incoming RCS text message in Telephony DB");
                objI = cbcw.m();
            } else {
                ekrw ekrwVarH = cavw.a.h();
                ekrwVarH.X(eksq.a, "BugleFileTransfer");
                ekrd ekrdVar2 = (ekrd) ekrwVarH;
                ekrdVar2.X(cqnc.b, messageCoreDataX.C());
                ekrdVar2.X(cqnc.f, messageCoreDataX.F());
                ((ekrd) ekrdVar2.h("com/google/android/apps/messaging/shared/datamodel/workhandlers/RcsToTelephonySyncHandler$RcsToTelephonySyncHandlerInternal", "updateIncomingRcsTextMessageInTelephony", 151, "RcsToTelephonySyncHandler.kt")).q("Updated incoming RCS text message in Telephony DB");
                objI = cbcw.i();
            }
        } else {
            if (i3 != 2) {
                int iB2 = cavy.b(i2);
                int i4 = iB2 != 0 ? iB2 : 1;
                Objects.toString(cavy.c(i4));
                throw new IllegalArgumentException("Unsupported message type: ".concat(cavy.c(i4)));
            }
            String str2 = cavzVar.i;
            str2.getClass();
            objI = cavvVar.a(messageCoreDataX, Uri.parse(str2), cavzVar.j, this);
        }
        return objI == fcylVar ? fcylVar : objI;
    }
}
