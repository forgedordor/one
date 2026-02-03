package defpackage;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.provider.ContactsContract;
import android.text.TextUtils;
import com.android.vcard.VCardEntry;
import j$.net.URLEncoder;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxfm {
    private static final cqce e = cqce.g("Bugle", "VCardResourceEntry");
    public final Context a;
    public final List b;
    public final Uri c;
    public final String d;

    public bxfm(Context context, VCardEntry vCardEntry, Uri uri) {
        this.a = context;
        this.b = a(context, vCardEntry);
        String displayName = vCardEntry.getDisplayName();
        if (displayName == null) {
            vCardEntry.consolidateFields();
            displayName = vCardEntry.getDisplayName();
        }
        this.d = displayName;
        this.c = uri;
    }

    private static List a(Context context, VCardEntry vCardEntry) throws Resources.NotFoundException {
        String string;
        String string2;
        String str;
        Resources resources = context.getResources();
        ArrayList arrayList = new ArrayList();
        if (vCardEntry.getPhoneList() != null) {
            for (VCardEntry.PhoneData phoneData : vCardEntry.getPhoneList()) {
                Intent intent = new Intent("android.intent.action.DIAL");
                intent.setData(Uri.parse("tel:".concat(String.valueOf(phoneData.getNumber()))));
                arrayList.add(new bxfl(phoneData.getNumber(), ContactsContract.CommonDataKinds.Phone.getTypeLabel(resources, phoneData.getType(), phoneData.getLabel()).toString(), intent));
            }
        }
        if (vCardEntry.getEmailList() != null) {
            for (VCardEntry.EmailData emailData : vCardEntry.getEmailList()) {
                Intent intent2 = new Intent("android.intent.action.SENDTO");
                intent2.setData(Uri.parse("mailto:"));
                intent2.putExtra("android.intent.extra.EMAIL", new String[]{emailData.getAddress()});
                arrayList.add(new bxfl(emailData.getAddress(), ContactsContract.CommonDataKinds.Phone.getTypeLabel(resources, emailData.getType(), emailData.getLabel()).toString(), intent2));
            }
        }
        if (vCardEntry.getPostalList() != null) {
            for (VCardEntry.PostalData postalData : vCardEntry.getPostalList()) {
                try {
                    str = resources.getStringArray(R.array.postalAddressTypes)[postalData.getType() - 1];
                } catch (Resources.NotFoundException unused) {
                    str = resources.getStringArray(R.array.postalAddressTypes)[2];
                } catch (Exception e2) {
                    e.o("createContactItem postal Exception.", e2);
                    str = resources.getStringArray(R.array.postalAddressTypes)[2];
                }
                Intent intent3 = new Intent("android.intent.action.VIEW");
                StringBuilder sb = new StringBuilder();
                String pobox = postalData.getPobox();
                if (!TextUtils.isEmpty(pobox)) {
                    sb.append(pobox);
                    sb.append(" ");
                }
                String extendedAddress = postalData.getExtendedAddress();
                if (!TextUtils.isEmpty(extendedAddress)) {
                    sb.append(extendedAddress);
                    sb.append(" ");
                }
                String street = postalData.getStreet();
                if (!TextUtils.isEmpty(street)) {
                    sb.append(street);
                    sb.append(" ");
                }
                String localty = postalData.getLocalty();
                if (!TextUtils.isEmpty(localty)) {
                    sb.append(localty);
                    sb.append(" ");
                }
                String region = postalData.getRegion();
                if (!TextUtils.isEmpty(region)) {
                    sb.append(region);
                    sb.append(" ");
                }
                String postalCode = postalData.getPostalCode();
                if (!TextUtils.isEmpty(postalCode)) {
                    sb.append(postalCode);
                    sb.append(" ");
                }
                String country = postalData.getCountry();
                if (!TextUtils.isEmpty(country)) {
                    sb.append(country);
                }
                String string3 = sb.toString();
                try {
                    intent3.setData(Uri.parse(a.v(URLEncoder.encode(string3, "UTF-8"), "geo:0,0?q=")));
                } catch (UnsupportedEncodingException unused2) {
                    intent3 = null;
                }
                arrayList.add(new bxfl(string3, str, intent3));
            }
        }
        if (vCardEntry.getImList() != null) {
            for (VCardEntry.ImData imData : vCardEntry.getImList()) {
                try {
                    string2 = resources.getString(ContactsContract.CommonDataKinds.Im.getProtocolLabelResource(imData.getProtocol()));
                } catch (Resources.NotFoundException unused3) {
                    string2 = null;
                }
                arrayList.add(new bxfl(imData.getAddress(), string2, null));
            }
        }
        if (vCardEntry.getOrganizationList() != null) {
            for (VCardEntry.OrganizationData organizationData : vCardEntry.getOrganizationList()) {
                try {
                    string = resources.getString(ContactsContract.CommonDataKinds.Organization.getTypeLabelResource(organizationData.getType()));
                } catch (Resources.NotFoundException unused4) {
                    string = resources.getStringArray(R.array.organizationTypes)[1];
                } catch (Exception e3) {
                    e.o("createContactItem org Exception.", e3);
                    string = resources.getStringArray(R.array.organizationTypes)[1];
                }
                arrayList.add(new bxfl(organizationData.getOrganizationName(), string, null));
            }
        }
        if (vCardEntry.getWebsiteList() != null) {
            for (VCardEntry.WebsiteData websiteData : vCardEntry.getWebsiteList()) {
                if (websiteData != null && TextUtils.isGraphic(websiteData.getWebsite())) {
                    String website = websiteData.getWebsite();
                    if (!website.startsWith("http://") && !website.startsWith("https://")) {
                        website = "http://".concat(String.valueOf(website));
                    }
                    arrayList.add(new bxfl(websiteData.getWebsite(), null, new Intent("android.intent.action.VIEW", Uri.parse(website))));
                }
            }
        }
        if (vCardEntry.getBirthday() != null) {
            String birthday = vCardEntry.getBirthday();
            if (TextUtils.isGraphic(birthday)) {
                arrayList.add(new bxfl(birthday, resources.getString(com.google.android.apps.messaging.R.string.vcard_detail_birthday_label), null));
            }
        }
        if (vCardEntry.getNotes() != null) {
            for (VCardEntry.NoteData noteData : vCardEntry.getNotes()) {
                if (TextUtils.isGraphic(noteData.getNote())) {
                    arrayList.add(new bxfl(noteData.getNote(), resources.getString(com.google.android.apps.messaging.R.string.vcard_detail_notes_label), null));
                }
            }
        }
        return arrayList;
    }
}
