package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpce extends cpby {
    private final String c;

    public cpce(Context context, cpbz cpbzVar, alqm alqmVar, String str) {
        super(context, cpbzVar, alqmVar);
        this.c = str;
    }

    @Override // defpackage.cpby
    public final int a() {
        return R.string.business_info_website_default_sub_header;
    }

    @Override // defpackage.cpby
    public final int b() {
        return R.drawable.business_web;
    }

    @Override // defpackage.cpby
    public final int c() {
        return R.string.business_action_website_short_content_description;
    }

    @Override // defpackage.cpby
    public final int d() {
        return R.string.business_action_website_short_text_m2;
    }

    @Override // defpackage.cpby
    public final Intent e() {
        return this.b.c(this.c);
    }

    @Override // defpackage.cpby
    public final String g(String str) {
        return this.a.getResources().getString(R.string.business_action_website_full_content_description, this.c, str);
    }

    @Override // defpackage.cpby
    public final int j() {
        return 3;
    }
}
