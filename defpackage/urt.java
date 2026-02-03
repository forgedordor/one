package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.apps.messaging.R;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoData;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoProperty;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class urt extends uqy {
    public cpcb a;
    public fcsu ag;
    public fcsu ah;
    public int ai = 0;
    public cpcd b;
    public cpcf c;
    public fcsu d;
    public fcsu e;

    @Override // defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = (LinearLayout) layoutInflater.inflate(R.layout.info_and_options_page_info_tab_fragment, viewGroup, false);
        url urlVar = this.aj;
        if (urlVar != null) {
            BusinessInfoData businessInfoData = (BusinessInfoData) ((uro) urlVar).b().orElse(null);
            if (businessInfoData == null) {
                cqca.f("Bugle", "Can't load business info contact actions: business info is null");
                return linearLayout;
            }
            ekgb<BusinessInfoProperty> phoneNumbers = businessInfoData.getPhoneNumbers();
            ekgb<BusinessInfoProperty> websites = businessInfoData.getWebsites();
            ekgb<BusinessInfoProperty> emailAddresses = businessInfoData.getEmailAddresses();
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(phoneNumbers);
            arrayList.addAll(websites);
            arrayList.addAll(emailAddresses);
            List[] listArr = {phoneNumbers, websites, emailAddresses};
            ArrayList arrayList2 = new ArrayList();
            int size = -1;
            for (int i = 0; i < 3; i++) {
                List list = listArr[i];
                if (list != null && list.size() > 0) {
                    size += list.size();
                    arrayList2.add(Integer.valueOf(size));
                }
            }
            if (!arrayList2.isEmpty()) {
                arrayList2.remove(arrayList2.size() - 1);
            }
            urs ursVar = new urs(this, fg(), arrayList, arrayList, businessInfoData, phoneNumbers, websites, emailAddresses, arrayList2);
            for (int i2 = 0; i2 < ursVar.getCount(); i2++) {
                linearLayout.addView(ursVar.getView(i2, null, linearLayout));
            }
        }
        return linearLayout;
    }
}
