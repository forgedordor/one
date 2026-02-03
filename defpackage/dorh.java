package defpackage;

import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dorh {
    public final View a;
    private final fctc c = fctd.a(new fdae() { // from class: dorc
        @Override // defpackage.fdae
        public final Object invoke() {
            return (RadioGroup) this.a.a.findViewById(R.id.gallery_google_photos_select_button_group);
        }
    });
    private final fctc d = fctd.a(new fdae() { // from class: dord
        @Override // defpackage.fdae
        public final Object invoke() {
            View childAt = this.a.d().getChildAt(0);
            childAt.getClass();
            return (RadioButton) childAt;
        }
    });
    public final fctc b = fctd.a(new fdae() { // from class: dore
        @Override // defpackage.fdae
        public final Object invoke() {
            View childAt = this.a.d().getChildAt(1);
            childAt.getClass();
            return (RadioButton) childAt;
        }
    });
    private final fctc e = fctd.a(new fdae() { // from class: dorf
        @Override // defpackage.fdae
        public final Object invoke() {
            return (Button) this.a.a.findViewById(R.id.gallery_google_photos_option_tray_neutral_button);
        }
    });
    private final fctc f = fctd.a(new fdae() { // from class: dorg
        @Override // defpackage.fdae
        public final Object invoke() {
            return (Button) this.a.a.findViewById(R.id.gallery_google_photos_option_tray_positive_button);
        }
    });

    public dorh(View view) {
        this.a = view;
    }

    public final Button a() {
        Object objA = this.e.a();
        objA.getClass();
        return (Button) objA;
    }

    public final Button b() {
        Object objA = this.f.a();
        objA.getClass();
        return (Button) objA;
    }

    public final RadioButton c() {
        return (RadioButton) this.d.a();
    }

    public final RadioGroup d() {
        Object objA = this.c.a();
        objA.getClass();
        return (RadioGroup) objA;
    }
}
