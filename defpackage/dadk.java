package defpackage;

import android.content.res.Resources;
import android.net.Uri;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.ui.ContactIconView;
import com.google.android.apps.messaging.ui.contact.ContactListItemView;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dadk extends vo {
    private final List a = new ArrayList();
    private final eidm d;
    private final fcsu e;
    private final fcsu f;

    public dadk(eidm eidmVar, fcsu fcsuVar, fcsu fcsuVar2) {
        this.d = eidmVar;
        this.e = fcsuVar;
        this.f = fcsuVar2;
    }

    @Override // defpackage.vo
    public final int a() {
        return this.a.size();
    }

    @Override // defpackage.vo
    public final /* bridge */ /* synthetic */ wv e(ViewGroup viewGroup, int i) {
        return new dadj((ContactListItemView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.contact_item_view_row, viewGroup, false));
    }

    @Override // defpackage.vo
    public final /* synthetic */ void g(wv wvVar, int i) {
        String strB;
        String string;
        dadj dadjVar = (dadj) wvVar;
        eifp eifpVarA = this.d.a("ContactsAdapter onBindViewHolder");
        try {
            qxf qxfVar = (qxf) this.a.get(i);
            long j = qxfVar.f;
            ekrg ekrgVar = cqiz.a;
            boolean zIsEnterpriseContactId = ContactsContract.Contacts.isEnterpriseContactId(j);
            ContactListItemView contactListItemView = dadjVar.s;
            String strD = qxfVar.b;
            String str = qxfVar.c;
            dadi dadiVar = new dadi(this.e, this.f);
            bacr bacrVar = contactListItemView.a;
            boolean z = qxfVar.j;
            boolean z2 = true;
            cqaz.k(true);
            bacrVar.a = qxfVar.h;
            bacrVar.b = j;
            bacrVar.c = qxfVar.k;
            bacrVar.d = qxfVar.g.longValue();
            bacrVar.e = strD;
            bacrVar.g = qxfVar.i;
            bacrVar.h = new ArrayList(1);
            bacrVar.h.add(bacrVar.n.a(str.toString(), qxfVar.d, qxfVar.e));
            bacrVar.i = qxfVar;
            if (strD == null) {
                strD = bacrVar.d(bacrVar.e);
            }
            bacrVar.j = strD;
            bacrVar.k = true;
            bacrVar.l = qxfVar.a;
            bacrVar.m = zIsEnterpriseContactId;
            contactListItemView.m = dadiVar;
            contactListItemView.b.setText(contactListItemView.a.j);
            boolean zBooleanValue = ((Boolean) alrj.a.e()).booleanValue();
            if (contactListItemView.a.a() == 1 && contactListItemView.b()) {
                bacr bacrVar2 = contactListItemView.a;
                if (bacrVar2.h.size() != 1) {
                    throw new IllegalStateException("Should only call this if it has only one destination");
                }
                bacq bacqVar = (bacq) bacrVar2.h.get(0);
                String strA = bacqVar.a();
                contactListItemView.c.setText(strA);
                Resources resources = contactListItemView.getResources();
                alqm alqmVarN = ((alrj) contactListItemView.l.b()).n(strA);
                ekrg ekrgVar2 = cpga.a;
                cczv cczvVar = alvx.a;
                String strB2 = ejwk.b(alqmVarN.G(((Boolean) new alva().get()).booleanValue()).a);
                if (TextUtils.isEmpty(strB2)) {
                    string = "";
                } else {
                    String[] strArr = cpga.c;
                    if (strArr[0] == null) {
                        int[] iArr = {R.string.content_description_for_number_zero, R.string.content_description_for_number_one, R.string.content_description_for_number_two, R.string.content_description_for_number_three, R.string.content_description_for_number_four, R.string.content_description_for_number_five, R.string.content_description_for_number_six, R.string.content_description_for_number_seven, R.string.content_description_for_number_eight, R.string.content_description_for_number_nine};
                        for (int i2 = 0; i2 < 10; i2++) {
                            strArr[i2] = resources.getString(iArr[i2]);
                        }
                    }
                    StringBuilder sb = new StringBuilder();
                    boolean z3 = false;
                    for (char c : strB2.toCharArray()) {
                        if (c < '0' || c > '9') {
                            sb.append(c);
                            z3 = true;
                        } else {
                            if (z3) {
                                sb.append(' ');
                            }
                            sb.append(strArr[c - '0']);
                            sb.append(' ');
                            z3 = false;
                        }
                    }
                    string = sb.toString();
                }
                contactListItemView.c.setContentDescription(string);
                contactListItemView.d.setText(ContactsContract.CommonDataKinds.Phone.getTypeLabel(contactListItemView.getResources(), bacqVar.b, ejwk.b(bacqVar.c)));
                strB = ejwk.b(bacqVar.a.p(zBooleanValue));
            } else {
                bacq bacqVarC = contactListItemView.a.c(0);
                contactListItemView.c.setText(contactListItemView.getResources().getString(R.string.contact_has_multiple_destinations_phone, bacqVarC.a(), Integer.valueOf(contactListItemView.a.a() - 1)));
                contactListItemView.d.setText(R.string.contact_has_multiple_destinations_type);
                strB = ejwk.b(bacqVarC.a.p(zBooleanValue));
            }
            String str2 = strB;
            bacr bacrVar3 = contactListItemView.a;
            long j2 = bacrVar3.b;
            if (j2 == -1000 || cpdz.a(j2)) {
                ContactIconView contactIconView = contactListItemView.e;
                Uri uriF = bacrVar3.f();
                bacr bacrVar4 = contactListItemView.a;
                contactIconView.i(uriF, bacrVar4.b, bacrVar4.c, bacrVar4.d, str2);
                contactListItemView.e.setVisibility(0);
                contactListItemView.b.setVisibility(0);
                contactListItemView.f.setVisibility(8);
                contactListItemView.g.setVisibility(8);
                contactListItemView.d.setVisibility(8);
                contactListItemView.c.setVisibility(8);
            } else if (bacrVar3.l || bacrVar3.k) {
                dadi dadiVar2 = contactListItemView.m;
                ContactIconView contactIconView2 = contactListItemView.e;
                Uri uriF2 = bacrVar3.f();
                bacr bacrVar5 = contactListItemView.a;
                contactIconView2.i(uriF2, bacrVar5.b, bacrVar5.c, bacrVar5.d, str2);
                contactListItemView.e.setVisibility(0);
                contactListItemView.b.setVisibility(0);
                dadi dadiVar3 = contactListItemView.m;
                bacr bacrVar6 = contactListItemView.a;
                contactListItemView.setSelected(false);
                contactListItemView.f.setVisibility(8);
                contactListItemView.g.setVisibility(8);
                contactListItemView.c.setVisibility(0);
                contactListItemView.d.setVisibility(0);
            } else {
                contactListItemView.e.g(null);
                contactListItemView.e.setVisibility(4);
                contactListItemView.b.setVisibility(8);
                dadi dadiVar4 = contactListItemView.m;
                bacr bacrVar7 = contactListItemView.a;
                contactListItemView.setSelected(false);
                contactListItemView.f.setVisibility(8);
                contactListItemView.g.setVisibility(8);
                contactListItemView.c.setVisibility(0);
                contactListItemView.d.setVisibility(0);
            }
            if (contactListItemView.a.m) {
                contactListItemView.h.setVisibility(0);
            } else {
                contactListItemView.h.setVisibility(8);
            }
            contactListItemView.i.k("Bugle.UI.ContactPickerActivity.InitiateToContactsShown.Duration");
            if (contactListItemView.m == null) {
                z2 = false;
            }
            cqaz.k(z2);
            contactListItemView.k.a(contactListItemView, contactListItemView);
            eifpVarA.close();
        } catch (Throwable th) {
            try {
                eifpVarA.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    public final void l(List list) {
        List list2 = this.a;
        int size = list2.size();
        int size2 = list.size();
        if (size == 0) {
            if (size2 == 0) {
                return;
            } else {
                size = 0;
            }
        }
        if (size2 == 0) {
            list2.clear();
            x(0, size);
        } else if (size == 0) {
            list2.addAll(list);
            w(0, list2.size());
        } else {
            list2.clear();
            list2.addAll(list);
            p();
        }
    }
}
