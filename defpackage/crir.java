package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.queries.MediaSearchQuery;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import java.io.Closeable;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crir extends fcyz implements fdat {
    int a;
    final /* synthetic */ criz b;
    final /* synthetic */ ConversationIdType c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public crir(fcxy fcxyVar, criz crizVar, ConversationIdType conversationIdType) {
        super(2, fcxyVar);
        this.b = crizVar;
        this.c = conversationIdType;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((crir) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Closeable closeable;
        Throwable th;
        fcyl fcylVar = fcyl.a;
        if (this.a != 0) {
            closeable = (Closeable) this.d;
            try {
                fctl.b(obj);
            } catch (Throwable th2) {
                th = th2;
                try {
                    throw th;
                } catch (Throwable th3) {
                    fczl.a(closeable, th);
                    throw th3;
                }
            }
        } else {
            fctl.b(obj);
            if (!eicg.b(u())) {
                throw new IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
            }
            eieu eieuVarH = eiiy.h("SmartSuggestionDatabaseOperations#hasSharedEmotiveContent");
            try {
                ekgb ekgbVarU = ekgb.u(new Integer(11), new Integer(26), new Integer(34), new Integer(35));
                ekgbVarU.getClass();
                StringBuilder sb = new StringBuilder();
                sb.append("(");
                sb.append(bxyf.a(null, this.c, ekgb.r("image/gif")));
                sb.append(")");
                ekqh it = ekgbVarU.iterator();
                while (it.hasNext()) {
                    String str = String.format(Locale.US, " OR %s = %d", Arrays.copyOf(new Object[]{PartsTable.d.y, new Integer(((Number) it.next()).intValue())}, 2));
                    str.getClass();
                    sb.append(str);
                }
                String string = sb.toString();
                biwj biwjVarA = MediaSearchQuery.a();
                biwjVarA.A("+hasSharedEmotiveContent");
                biwjVarA.s();
                biwjVarA.e(new cris(string));
                biwjVarA.c(new biwg(MediaSearchQuery.b.a));
                cczi ccziVar = crbf.G;
                if (((Number) ccziVar.e()).intValue() >= 0) {
                    Object objE = ccziVar.e();
                    objE.getClass();
                    biwjVarA.y(((Number) objE).intValue());
                }
                fcyh fcyhVarA = eicg.a(this.b.a);
                crit critVar = new crit(null, biwjVarA);
                this.d = eieuVarH;
                this.a = 1;
                Object objA = fdin.a(fcyhVarA, critVar, this);
                if (objA == fcylVar) {
                    return fcylVar;
                }
                closeable = eieuVarH;
                obj = objA;
            } catch (Throwable th4) {
                closeable = eieuVarH;
                th = th4;
                throw th;
            }
        }
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        fczl.a(closeable, null);
        return bool;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        crir crirVar = new crir(fcxyVar, this.b, this.c);
        crirVar.d = obj;
        return crirVar;
    }
}
