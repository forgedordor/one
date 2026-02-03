package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xlk extends fcyz implements fdat {
    int a;
    final /* synthetic */ xlm b;
    final /* synthetic */ Context c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xlk(fcxy fcxyVar, xlm xlmVar, Context context) {
        super(2, fcxyVar);
        this.b = xlmVar;
        this.c = context;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((xlk) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        ekrw ekrwVarE = xlm.a.e();
        ekrwVarE.X(eksq.a, "BugleComposeRow2");
        ((ekrd) ekrwVarE.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/voice/VoiceInputUiAdapter$onLongPress$$inlined$asyncPropagatingLegacy$default$1", "invokeSuspend", 119, "VoiceInputUiAdapter.kt")).q("Voice input long press");
        xlm xlmVar = this.b;
        if (((xmd) xlmVar.d.b()).h()) {
            return true;
        }
        Context context = this.c;
        this.a = 1;
        Object objC = xlmVar.c(context, 3, this);
        return objC == fcylVar ? fcylVar : objC;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        xlk xlkVar = new xlk(fcxyVar, this.b, this.c);
        xlkVar.d = obj;
        return xlkVar;
    }
}
