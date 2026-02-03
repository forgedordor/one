package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cxwi implements TextWatcher {
    final /* synthetic */ String a;
    final /* synthetic */ EditText b;
    final /* synthetic */ cxwj c;

    public cxwi(cxwj cxwjVar, String str, EditText editText) {
        this.a = str;
        this.b = editText;
        this.c = cxwjVar;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        ekgp ekgpVar = cxwj.b;
        final String str = this.a;
        if (!ekgpVar.containsKey(str)) {
            ekrw ekrwVarJ = cxwj.a.j();
            ekrwVarJ.X(eksq.a, "BugleCms");
            ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/ui/debug/cloudstore/DebugCmsUtils$5", "onTextChanged", 452, "DebugCmsUtils.java")).t("DebugCmsUtils: Cannot %s using createCmsSettingsEditText", str);
        } else {
            final String strTrim = this.b.getText().toString().trim();
            Runnable runnable = new Runnable() { // from class: cxwh
                /* JADX WARN: Removed duplicated region for block: B:28:0x005e  */
                /* JADX WARN: Removed duplicated region for block: B:30:0x0061  */
                /* JADX WARN: Removed duplicated region for block: B:36:0x0083 A[Catch: Exception -> 0x0111, TryCatch #0 {Exception -> 0x0111, blocks: (B:3:0x000e, B:6:0x001e, B:8:0x0024, B:11:0x002c, B:32:0x0065, B:63:0x00f6, B:33:0x006e, B:34:0x0079, B:35:0x007a, B:36:0x0083, B:37:0x009c, B:58:0x00d3, B:59:0x00db, B:60:0x00e6, B:61:0x00e7, B:62:0x00ef), top: B:68:0x000e }] */
                /* JADX WARN: Removed duplicated region for block: B:54:0x00cc  */
                /* JADX WARN: Removed duplicated region for block: B:56:0x00cf  */
                /* JADX WARN: Removed duplicated region for block: B:62:0x00ef A[Catch: Exception -> 0x0111, TryCatch #0 {Exception -> 0x0111, blocks: (B:3:0x000e, B:6:0x001e, B:8:0x0024, B:11:0x002c, B:32:0x0065, B:63:0x00f6, B:33:0x006e, B:34:0x0079, B:35:0x007a, B:36:0x0083, B:37:0x009c, B:58:0x00d3, B:59:0x00db, B:60:0x00e6, B:61:0x00e7, B:62:0x00ef), top: B:68:0x000e }] */
                /* JADX WARN: Type inference failed for: r7v14, types: [cmfo, java.lang.Object] */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void run() {
                    /*
                        Method dump skipped, instructions count: 307
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.cxwh.run():void");
                }
            };
            eosc eoscVar = this.c.d;
            eijx.f(runnable, eoscVar).k(auvh.b(), eoscVar);
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
