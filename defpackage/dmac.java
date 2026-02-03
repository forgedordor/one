package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmac extends fcyz implements fdat {
    int a;
    final /* synthetic */ dmaf b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmac(dmaf dmafVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dmafVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dmac) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        dlwv dlwoVar;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            dmaf dmafVar = this.b;
            if (dmafVar.h()) {
                throw new IllegalStateException("This instance has already been prepared");
            }
            ekrw ekrwVarH = dmaf.a.h();
            ekrwVarH.X(eksq.a, "HugoAudio");
            ekrd ekrdVar = (ekrd) ekrwVarH.h("com/google/android/libraries/compose/audio/sink/FileAudioSink$prepare$2", "invokeSuspend", 68, "FileAudioSink.kt");
            dmag dmagVar = dmafVar.f;
            Uri uri = dmagVar.a;
            Objects.toString(uri);
            String strConcat = "outputUri = ".concat(uri.toString());
            ebsu ebsuVar = dmagVar.b;
            Objects.toString(ebsuVar);
            String strConcat2 = "sourcePolicy = ".concat(ebsuVar.toString());
            dogg doggVar = dmagVar.d;
            Objects.toString(doggVar);
            String strConcat3 = "format = ".concat(doggVar.toString());
            StringBuilder sb = new StringBuilder("sampleRate = ");
            int i2 = dmagVar.e;
            sb.append(i2);
            String string = sb.toString();
            StringBuilder sb2 = new StringBuilder("bitRate = ");
            int i3 = dmagVar.g;
            sb2.append(i3);
            String string2 = sb2.toString();
            Integer num = dmagVar.h;
            Objects.toString(num);
            String[] strArr = {strConcat, strConcat2, strConcat3, string, "channelCount = 1", string2, "maxFileSize = ".concat(String.valueOf(num))};
            dlwv dlwvVar = null;
            ekrdVar.t("Preparing FileAudioSink with configuration: %s", fcur.S(strArr, null, null, null, 63));
            if (fdbq.f(doggVar, doft.a)) {
                dlxh dlxhVar = dmafVar.c;
                dlxg dlxgVar = new dlxg(uri, ebsuVar, i2, i3, num);
                fcyh fcyhVar = (fcyh) dlxhVar.a.b();
                fcyhVar.getClass();
                Context context = (Context) dlxhVar.b.b();
                context.getClass();
                dlwoVar = new dlxf(fcyhVar, context, dlxgVar);
            } else {
                if (!fdbq.f(doggVar, dofr.a)) {
                    throw new IllegalArgumentException(a.h(doggVar, "Format ", " is not supported."));
                }
                dlwq dlwqVar = dmafVar.d;
                dlwp dlwpVar = new dlwp(uri, ebsuVar, i2, i3, num);
                fcyh fcyhVar2 = (fcyh) dlwqVar.a.b();
                fcyhVar2.getClass();
                Context context2 = (Context) dlwqVar.b.b();
                context2.getClass();
                dlwoVar = new dlwo(fcyhVar2, context2, dlwpVar);
            }
            dmafVar.i = dlwoVar;
            dlwv dlwvVar2 = dmafVar.i;
            if (dlwvVar2 == null) {
                fdbq.c("encoder");
            } else {
                dlwvVar = dlwvVar2;
            }
            this.a = 1;
            if (dlwvVar.d(this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dmac(this.b, fcxyVar);
    }
}
