package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abun extends fcyz implements fdat {
    int a;
    final /* synthetic */ abuo b;
    final /* synthetic */ MessageCoreData c;
    final /* synthetic */ MessageCoreData d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abun(abuo abuoVar, MessageCoreData messageCoreData, MessageCoreData messageCoreData2, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = abuoVar;
        this.c = messageCoreData;
        this.d = messageCoreData2;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((abun) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            dnuy dnuyVar = (dnuy) this.b.e.b();
            this.a = 1;
            obj = dnuyVar.a(this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            abuo abuoVar = this.b;
            MessageCoreData messageCoreData = this.d;
            ezgh ezghVar = (ezgh) ezgi.a.createBuilder();
            ezghVar.getClass();
            ezbv ezbvVar = (ezbv) ezbw.a.createBuilder();
            ezbvVar.getClass();
            Uri uriA = abuo.a(messageCoreData);
            if (uriA != null) {
                String string = uriA.toString();
                string.getClass();
                ezbvVar.copyOnWrite();
                ((ezbw) ezbvVar.instance).b = string;
            }
            evsn evsnVarBuild = ezbvVar.build();
            evsnVarBuild.getClass();
            ezghVar.copyOnWrite();
            ezgi ezgiVar = (ezgi) ezghVar.instance;
            ezgiVar.d = (ezbw) evsnVarBuild;
            ezgiVar.c = 29;
            ezgf ezgfVar = (ezgf) ezgg.b.createBuilder();
            ezgfVar.getClass();
            ezat.b(ezan.CREATE_PHOTOMOJI, ezgfVar);
            ezau.c(ezat.a(ezgfVar), ezghVar);
            List listB = fcva.b(ezau.a(ezghVar));
            crif crifVar = (crif) abuoVar.d.b();
            MessageCoreData messageCoreData2 = this.c;
            ConversationIdType conversationIdTypeA = messageCoreData2.A();
            conversationIdTypeA.getClass();
            MessageIdType messageIdTypeC = messageCoreData2.C();
            messageIdTypeC.getClass();
            crifVar.j(listB, conversationIdTypeA, messageIdTypeC, ((cogw) abuoVar.c.b()).f().toEpochMilli());
            ((eksl) abuo.a.h()).t("Created a photomoji smart chips for image with uri: %s", abuo.a(messageCoreData));
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new abun(this.b, this.c, this.d, fcxyVar);
    }
}
