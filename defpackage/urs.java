package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.conversation.settings.BusinessContactActionView;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoData;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoProperty;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class urs extends ArrayAdapter {
    final /* synthetic */ List a;
    final /* synthetic */ BusinessInfoData b;
    final /* synthetic */ List c;
    final /* synthetic */ List d;
    final /* synthetic */ List e;
    final /* synthetic */ List f;
    final /* synthetic */ urt g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public urs(urt urtVar, Context context, List list, List list2, BusinessInfoData businessInfoData, List list3, List list4, List list5, List list6) {
        super(context, 0, list);
        this.a = list2;
        this.b = businessInfoData;
        this.c = list3;
        this.d = list4;
        this.e = list5;
        this.f = list6;
        this.g = urtVar;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) throws Resources.NotFoundException {
        View view2 = view;
        if (view == null) {
            View viewInflate = this.g.fg().getLayoutInflater().inflate(R.layout.business_contact_action, viewGroup, false);
            upq upqVar = new upq();
            upqVar.a = (TextView) viewInflate.findViewById(R.id.business_contact_action_header);
            upqVar.b = (TextView) viewInflate.findViewById(R.id.business_contact_action_sub_header);
            upqVar.c = (ImageView) viewInflate.findViewById(R.id.business_contact_action_icon);
            upqVar.d = viewInflate.findViewById(R.id.business_contact_action_group_divider);
            upqVar.e = viewInflate.findViewById(R.id.business_contact_action_row);
            viewInflate.setTag(upqVar);
            view2 = viewInflate;
        }
        BusinessInfoProperty businessInfoProperty = (BusinessInfoProperty) this.a.get(i);
        String value = businessInfoProperty.getValue();
        urt urtVar = this.g;
        alqm alqmVarA = ((alrj) urtVar.d.b()).a(this.b.getRbmBotId());
        cpby cpbyVarA = this.c.contains(businessInfoProperty) ? urtVar.a.a(alqmVarA, value) : this.d.contains(businessInfoProperty) ? urtVar.c.a(alqmVarA, value) : this.e.contains(businessInfoProperty) ? urtVar.b.a(alqmVarA, value) : null;
        String header = businessInfoProperty.getHeader();
        String subHeader = businessInfoProperty.getSubHeader();
        BusinessContactActionView businessContactActionView = (BusinessContactActionView) view2;
        if (this.f.contains(Integer.valueOf(i))) {
            businessContactActionView.a(cpbyVarA, header, subHeader, true);
            return view2;
        }
        businessContactActionView.a(cpbyVarA, header, subHeader, false);
        return view2;
    }
}
