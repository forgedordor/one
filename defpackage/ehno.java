package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class ehno extends ea implements eifl {
    protected final eics a = new eics(this);

    @Override // defpackage.ea
    public final boolean aM(MenuItem menuItem) throws IOException {
        fczl.a(this.a.j(), null);
        return false;
    }

    @Override // defpackage.ea
    public final void aR(int i, int i2) throws IOException {
        fczl.a(this.a.h(i, i2), null);
    }

    @Override // defpackage.ea
    public final void aS(int i, int i2) throws IOException {
        fczl.a(this.a.h(i, i2), null);
    }

    @Override // defpackage.ea
    public final void ae(Bundle bundle) throws IOException {
        eifp eifpVarC = this.a.c();
        try {
            super.ae(bundle);
            fczl.a(eifpVarC, null);
        } finally {
        }
    }

    @Override // defpackage.ea
    public final void af(int i, int i2, Intent intent) throws IOException {
        eifp eifpVarF = this.a.f();
        try {
            super.af(i, i2, intent);
            fczl.a(eifpVarF, null);
        } finally {
        }
    }

    @Override // defpackage.ea
    public final void ai() throws IOException {
        eifp eifpVarB = this.a.b();
        try {
            super.ai();
            fczl.a(eifpVarB, null);
        } finally {
        }
    }

    @Override // defpackage.ea
    public final void am() throws IOException {
        eifp eifpVarC = this.a.c();
        try {
            super.am();
            fczl.a(eifpVarC, null);
        } finally {
        }
    }

    @Override // defpackage.ea
    public final void ao() throws IOException {
        eifp eifpVarB = this.a.b();
        try {
            super.ao();
            fczl.a(eifpVarB, null);
        } finally {
        }
    }

    @Override // defpackage.ea
    public final void ap(View view, Bundle bundle) throws IOException {
        view.getClass();
        fczl.a(this.a.c(), null);
    }

    public eiik bf() {
        throw null;
    }

    public void bh(eiik eiikVar, boolean z) {
        throw null;
    }

    public void bi(eiik eiikVar) {
        throw null;
    }

    @Override // defpackage.ea
    public void g(Context context) {
        super.g(context);
        lvj lvjVar = this.E;
        if (lvjVar instanceof eifl) {
            eics eicsVar = this.a;
            if (eicsVar.a == null) {
                eicsVar.e(((eifl) lvjVar).bf(), true);
            }
        }
        this.a.d();
    }

    @Override // defpackage.ea
    public final void h(Bundle bundle) throws IOException {
        eifp eifpVarC = this.a.c();
        try {
            super.h(bundle);
            fczl.a(eifpVarC, null);
        } finally {
        }
    }

    @Override // defpackage.ea
    public final void i() throws IOException {
        eifp eifpVarB = this.a.b();
        try {
            super.i();
            fczl.a(eifpVarB, null);
        } finally {
        }
    }

    @Override // defpackage.ea
    public final void k(Bundle bundle) throws IOException {
        fczl.a(this.a.c(), null);
    }

    @Override // defpackage.ea
    public final void l() throws IOException {
        eifp eifpVarC = this.a.c();
        try {
            super.l();
            fczl.a(eifpVarC, null);
        } finally {
        }
    }

    @Override // defpackage.ea
    public final void m() throws IOException {
        eifp eifpVarC = this.a.c();
        try {
            super.m();
            fczl.a(eifpVarC, null);
        } finally {
        }
    }

    protected final void p() {
        super.j();
    }

    protected final void q(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        super.M(layoutInflater, viewGroup, bundle);
    }
}
