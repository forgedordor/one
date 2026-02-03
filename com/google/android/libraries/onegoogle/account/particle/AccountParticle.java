package com.google.android.libraries.onegoogle.account.particle;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import defpackage.dyad;
import defpackage.dyae;
import defpackage.dyyb;
import defpackage.dyyh;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class AccountParticle<AccountT> extends ConstraintLayout implements dyae, dyyh {
    public dyad i;
    public final AccountParticleDisc j;
    public final TextView k;
    public final TextView l;
    public boolean m;
    private final TextView n;

    public AccountParticle(Context context) {
        this(context, null);
    }

    @Override // defpackage.dyyh
    public final void b(dyyb dyybVar) {
        if (this.m) {
            dyybVar.c(this, 90144);
            this.j.g(dyybVar);
        }
    }

    @Override // defpackage.dyae
    public final TextView f() {
        return this.n;
    }

    @Override // defpackage.dyae
    public final TextView g() {
        return this.k;
    }

    @Override // defpackage.dyyh
    public final void gW(dyyb dyybVar) {
        if (this.m) {
            AccountParticleDisc accountParticleDisc = this.j;
            if (accountParticleDisc.h) {
                accountParticleDisc.b.gW(dyybVar);
            }
            if (accountParticleDisc.i) {
                accountParticleDisc.c.gW(dyybVar);
            }
            dyybVar.e(this);
        }
    }

    @Override // defpackage.dyae
    public final TextView h() {
        return this.l;
    }

    @Override // defpackage.dyae
    public final AccountParticleDisc i() {
        return this.j;
    }

    public AccountParticle(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.ogAccountParticleStyle);
    }

    public AccountParticle(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.account_particle, (ViewGroup) this, true);
        AccountParticleDisc accountParticleDisc = (AccountParticleDisc) findViewById(R.id.account_avatar);
        accountParticleDisc.getClass();
        this.j = accountParticleDisc;
        TextView textView = (TextView) findViewById(R.id.og_primary_account_information);
        textView.getClass();
        this.k = textView;
        TextView textView2 = (TextView) findViewById(R.id.og_secondary_account_information);
        textView2.getClass();
        this.l = textView2;
        this.n = (TextView) findViewById(R.id.counter);
    }
}
