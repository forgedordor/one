package defpackage;

import android.content.Intent;
import android.speech.SpeechRecognizer;
import j$.util.Optional;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class suw extends fcyz implements fdat {
    final /* synthetic */ sux a;
    final /* synthetic */ Locale b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public suw(fcxy fcxyVar, sux suxVar, Locale locale) {
        super(2, fcxyVar);
        this.a = suxVar;
        this.b = locale;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((suw) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ((SpeechRecognizer) ((Optional) this.a.c.b()).get()).triggerModelDownload(new Intent().putExtra("android.speech.extra.LANGUAGE", this.b.toLanguageTag()));
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        suw suwVar = new suw(fcxyVar, this.a, this.b);
        suwVar.c = obj;
        return suwVar;
    }
}
