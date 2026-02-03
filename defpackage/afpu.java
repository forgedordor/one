package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afpu implements afps {
    public final String a;
    public final String b;
    public final String c;
    private final Context d;
    private final fdjx e;
    private final fduf f;
    private final fdvc g;

    public afpu(Context context, fdjx fdjxVar, afre afreVar, wre wreVar) {
        context.getClass();
        fdjxVar.getClass();
        afreVar.getClass();
        wreVar.getClass();
        this.d = context;
        this.e = fdjxVar;
        String str = context.getString(R.string.disable_reason_empty_input) + " " + context.getString(R.string.compose_icon_send_content_description);
        this.a = str;
        this.b = context.getString(R.string.disable_reason_too_many_characters) + " " + context.getString(R.string.compose_icon_send_content_description);
        this.c = context.getString(R.string.disable_reason_already_sending) + " " + context.getString(R.string.compose_icon_send_content_description);
        fduf fdufVarA = fdvf.a(false);
        this.f = fdufVarA;
        this.g = fdtg.b(fdud.a(afreVar.a, wreVar.a, fdufVarA, new afpt(this, null)), fdjxVar, fdur.b, new afpp(str));
    }

    @Override // defpackage.afps
    public final fdvc a() {
        return this.g;
    }

    @Override // defpackage.afps
    public final void b() {
        this.f.f(true);
    }

    @Override // defpackage.afps
    public final void c() {
        this.f.f(false);
    }
}
