package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.PermissionContentItemView;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cyym extends ehcx {
    final /* synthetic */ cyye a;

    public cyym(cyye cyyeVar) {
        this.a = cyyeVar;
    }

    @Override // defpackage.ehcx
    public final /* bridge */ /* synthetic */ View a(ViewGroup viewGroup) {
        return (PermissionContentItemView) LayoutInflater.from(this.a.e).inflate(R.layout.compose2o_permissions_item_view, viewGroup, false);
    }

    @Override // defpackage.ehcx
    public final /* bridge */ /* synthetic */ void b(View view, Object obj) {
        ((PermissionContentItemView) view).setOnClickListener(new View.OnClickListener() { // from class: cyyl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                czah czahVar = this.a.a.d;
                crmg crmgVar = (crmg) czahVar.f.b();
                final czbw czbwVar = czahVar.g;
                czbwVar.getClass();
                crmgVar.j(new crmf() { // from class: czae
                    @Override // defpackage.crmf
                    public final void b() {
                        czbwVar.a();
                    }

                    @Override // defpackage.crmf
                    public final /* synthetic */ boolean c() {
                        return true;
                    }

                    @Override // defpackage.crmf
                    public final /* synthetic */ void a() {
                    }
                });
            }
        });
    }

    @Override // defpackage.ehcx
    public final /* bridge */ /* synthetic */ void c(View view) {
        ((PermissionContentItemView) view).setOnClickListener(null);
    }
}
