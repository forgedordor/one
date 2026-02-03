package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xlj extends fcyz implements fdat {
    int a;
    final /* synthetic */ xlm b;
    final /* synthetic */ Context c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xlj(xlm xlmVar, Context context, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = xlmVar;
        this.c = context;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((xlj) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            xlm xlmVar = this.b;
            agff agffVar = new agff(crmc.RECORD_AUDIO_PERMISSIONS);
            this.a = 1;
            obj = xlmVar.h.f(agffVar, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            this.b.b(this.c, R.string.voice_messages_hold_to_record_tooltip_text);
        } else {
            this.b.b(this.c, R.string.microphone_permission_denied_text);
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new xlj(this.b, this.c, fcxyVar);
    }
}
