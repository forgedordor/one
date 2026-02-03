package defpackage;

import android.app.assist.AssistContent;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vrn extends fcyz implements fdat {
    int a;
    final /* synthetic */ vro b;
    final /* synthetic */ AssistContent c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vrn(vro vroVar, AssistContent assistContent, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = vroVar;
        this.c = assistContent;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((vrn) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        int iOrdinal;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            vro vroVar = this.b;
            this.a = 1;
            obj = fdtc.a(vroVar.c, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        ajlk ajlkVar = (ajlk) obj;
        String strB = this.b.b.b();
        JSONObject jSONObject = new JSONObject();
        try {
            ajlj ajljVarC = ajlkVar.c();
            String str = null;
            if (ajljVarC != null && (iOrdinal = ajljVarC.ordinal()) != 0) {
                if (iOrdinal == 1) {
                    str = "Individual";
                } else if (iOrdinal == 2) {
                    str = "Group";
                } else if (iOrdinal == 3) {
                    str = "RBM";
                } else {
                    if (iOrdinal != 4) {
                        throw new fctg();
                    }
                    str = "Business";
                }
            }
            if (str != null) {
                jSONObject.put("conversation_type", str);
            }
            jSONObject.put("conversation_id", strB).getClass();
        } catch (JSONException e) {
            ((ekrd) ((ekrd) vro.a.j()).g(e).h("com/google/android/apps/messaging/conversation2/assistant/AssistantAdapterImpl$onProvideAssistContent$1", "invokeSuspend", 47, "AssistantAdapterImpl.kt")).q("Error parsing ConversationData for Assistant");
        }
        AssistContent assistContent = this.c;
        assistContent.setStructuredData(jSONObject.toString());
        assistContent.getIntent().putExtra("conversation_id", strB);
        assistContent.getIntent().putExtra("mapi_conversation_id", this.b.b);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new vrn(this.b, this.c, fcxyVar);
    }
}
