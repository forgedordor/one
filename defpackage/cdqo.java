package defpackage;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdqo implements accc {
    public static final cqce a = cqce.g("Lighter", "LighterESITopView");
    public final aijh b;
    public final ejvr c;
    private final ehrb d;
    private final eovb e;

    public cdqo(aijh aijhVar, ehrb ehrbVar, eovb eovbVar, ejvr ejvrVar) {
        this.b = aijhVar;
        this.d = ehrbVar;
        this.e = eovbVar;
        this.c = ejvrVar;
    }

    @Override // defpackage.accc
    public final View a(final LayoutInflater layoutInflater, ViewGroup viewGroup) {
        layoutInflater.getClass();
        viewGroup.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.lighter_express_sign_in, viewGroup, false);
        viewInflate.getClass();
        View viewFindViewById = viewInflate.findViewById(R.id.esi_close_button);
        viewFindViewById.setVisibility(0);
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: cdqm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cdqo.a.m("Lighter ESI close button clicked");
                this.a.c.apply(null);
            }
        });
        viewInflate.findViewById(R.id.learn_more).setOnClickListener(new View.OnClickListener() { // from class: cdqn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.b.t(layoutInflater.getContext(), (String) cdpn.c.e());
            }
        });
        eovb eovbVar = this.e;
        if (eovbVar == null) {
            a.m("BusinessData is null. TopView will show generic business name & logo.");
            return viewInflate;
        }
        if (!TextUtils.isEmpty(eovbVar.b)) {
            String string = layoutInflater.getContext().getString(R.string.lighter_express_sign_in_title_with_business_name, eovbVar.b);
            string.getClass();
            ((TextView) viewInflate.findViewById(R.id.esi_title)).setText(string);
        }
        String str = eovbVar.c;
        str.getClass();
        if (str.length() != 0) {
            ImageView imageView = (ImageView) viewInflate.findViewById(R.id.business_avatar_icon);
            imageView.setVisibility(0);
            ((rbr) this.d.f(eovbVar.c).A()).v(imageView);
            viewInflate.findViewById(R.id.default_business_avatar_icon_content).setVisibility(8);
        }
        return viewInflate;
    }

    @Override // defpackage.accc
    public final /* synthetic */ void b() {
    }
}
