package defpackage;

import android.content.Context;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ecru extends ClickableSpan {
    final /* synthetic */ Context a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;

    public ecru(Context context, String str, String str2) {
        this.a = context;
        this.b = str;
        this.c = str2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        ecsc ecscVar = new ecsc();
        String str = this.b;
        if (str == null) {
            str = "https://www.google.com/policies/terms/";
        }
        Context context = this.a;
        ecrw.d(context, str);
        ecsj ecsjVar = ecrz.c;
        if (ecrz.c(fbka.b(ecrz.b))) {
            String str2 = this.c;
            ecsa ecsaVarA = ecsa.a();
            exhv exhvVar = (exhv) exhx.a.createBuilder();
            exhvVar.copyOnWrite();
            ((exhx) exhvVar.instance).b = 0;
            exhvVar.copyOnWrite();
            ((exhx) exhvVar.instance).c = exhw.a(5);
            ecsaVarA.d((exhx) exhvVar.build(), ecscVar.b(), ecscVar.a(), context, str2);
        }
    }
}
