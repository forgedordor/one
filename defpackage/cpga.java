package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.speech.tts.TextToSpeech;
import android.telephony.PhoneNumberUtils;
import android.text.SpannableString;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.Toast;
import com.google.android.apps.messaging.R;
import j$.util.Map;
import j$.util.function.Function$CC;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cpga {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/util/accessibility/AccessibilityUtil");
    public static final String b = Button.class.getName();
    public static final String[] c = new String[10];
    public static final ekhx d = new ekph("com.samsung.SMT");
    public final Context f;
    public TextToSpeech g;
    public final Object e = new Object();
    private final Map h = new HashMap();

    public cpga(Context context) {
        this.f = context;
    }

    public static String d(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(length + length);
        for (char c2 : str.toCharArray()) {
            sb.append(c2);
            sb.append((char) 8291);
        }
        return sb.toString();
    }

    public static void e(String str, View view) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getApplicationContext().getSystemService("accessibility");
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            return;
        }
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(16384);
        accessibilityEventObtain.setSource(view);
        accessibilityEventObtain.setClassName(view.getContext().getClass().getName());
        accessibilityEventObtain.setPackageName(view.getContext().getPackageName());
        accessibilityEventObtain.setEnabled(true);
        accessibilityEventObtain.getText().add(str);
        accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain);
    }

    public static boolean f(Context context) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public static boolean g(Context context) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
        return accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled();
    }

    @Deprecated
    public static void h(View view, CharSequence charSequence) {
        Context context = view.getContext();
        if (f(context)) {
            Toast.makeText(context, charSequence, 0).show();
        }
    }

    public final SpannableString a(alqm alqmVar) {
        cczv cczvVar = alvx.a;
        return b(ejwk.b(alqmVar.G(((Boolean) new alva().get()).booleanValue()).a));
    }

    @Deprecated
    public final SpannableString b(String str) {
        return (SpannableString) Map.EL.computeIfAbsent(this.h, str, new Function() { // from class: cpfw
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                String defaultEngine;
                String str2 = (String) obj;
                cpga cpgaVar = this.a;
                synchronized (cpgaVar.e) {
                    if (cpgaVar.g == null) {
                        cpgaVar.g = new TextToSpeech(cpgaVar.f, new TextToSpeech.OnInitListener() { // from class: cpfv
                            @Override // android.speech.tts.TextToSpeech.OnInitListener
                            public final void onInit(int i) {
                                ekrg ekrgVar = cpga.a;
                            }
                        });
                    }
                    defaultEngine = cpgaVar.g.getDefaultEngine();
                }
                ekrw ekrwVarG = cpga.a.g();
                ekrwVarG.X(eksq.a, "Bugle");
                ((ekrd) ((ekrd) ekrwVarG).h("com/google/android/apps/messaging/shared/util/accessibility/AccessibilityUtil", "getTtsEngine", 237, "AccessibilityUtil.java")).t("TTS engine: %s", defaultEngine);
                String strC = cssf.c(str2);
                if (!cpga.d.contains(defaultEngine)) {
                    SpannableString spannableString = new SpannableString(strC);
                    PhoneNumberUtils.addTtsSpan(spannableString, 0, strC.length());
                    return spannableString;
                }
                StringBuilder sb = new StringBuilder();
                boolean z = false;
                for (char c2 : strC.toCharArray()) {
                    if (c2 < '0' || c2 > '9') {
                        z = false;
                    } else {
                        if (z) {
                            sb.append((char) 8291);
                        }
                        z = true;
                    }
                    sb.append(c2);
                }
                return new SpannableString(sb.toString());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    public final String c(cpfz cpfzVar) throws Resources.NotFoundException {
        String string;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        cpgc cpgcVar = (cpgc) cpfzVar;
        int i6 = cpgcVar.b;
        Resources resources = cpgcVar.a;
        if (i6 == 0) {
            string = resources.getString(R.string.failed_message);
        } else if (i6 == 2) {
            string = resources.getString(R.string.urgent);
        } else if (i6 != 3) {
            string = i6 != 4 ? i6 != 5 ? "" : resources.getString(R.string.notyetdelivered) : resources.getString(R.string.sending);
        } else if (cpgcVar.c) {
            string = resources.getString(R.string.unsent);
        } else {
            int i7 = cpgcVar.m;
            string = i7 == 0 ? resources.getString(R.string.unread) : resources.getQuantityString(R.plurals.unread_with_count, i7, Integer.valueOf(i7));
        }
        boolean z = cpgcVar.c;
        String string2 = z ? resources.getString(R.string.outgoing) : resources.getString(R.string.incoming);
        String string3 = z ? resources.getString(R.string.to) : resources.getString(R.string.from);
        String str = cpgcVar.h;
        String string4 = !ejwk.c(str) ? resources.getString(R.string.subject_content_description, str) : null;
        if (i6 != 1) {
            if (i6 == 3 && !z) {
                int i8 = cpgcVar.f;
                if (i8 == 0) {
                    i5 = R.string.unsuccess_message_format;
                } else if (i8 == 1) {
                    String str2 = cpgcVar.g;
                    i5 = le.s(str2) ? R.string.unsuccess_message_format_with_single_attachment_location : le.m(str2) ? R.string.unsuccess_message_format_with_single_attachment_image : le.z(str2) ? R.string.unsuccess_message_format_with_single_attachment_video : le.f(str2) ? R.string.unsuccess_message_format_with_single_attachment_audio : R.string.unsuccess_message_format_with_single_attachment;
                } else {
                    i5 = R.string.unsuccess_message_format_with_multiple_attachments;
                }
                String strB = ejwk.b(string);
                String strB2 = ejwk.b(string3);
                String strB3 = ejwk.b(cpgcVar.e);
                String strB4 = ejwk.b(string4);
                String str3 = cpgcVar.i;
                if (str3 == null) {
                    str3 = cpgcVar.l;
                }
                return resources.getString(i5, strB, strB2, strB3, strB4, ejwk.b(str3), ejwk.b(cpgcVar.j), ejwk.b(cpgcVar.k));
            }
            int i9 = cpgcVar.f;
            if (i9 == 0) {
                i4 = R.string.unsuccessful_message_format_v2;
            } else if (i9 == 1) {
                String str4 = cpgcVar.g;
                i4 = le.s(str4) ? R.string.unsuccessful_message_format_with_single_attachment_location_v2 : le.m(str4) ? R.string.unsuccessful_message_format_with_single_attachment_image_v2 : le.z(str4) ? R.string.unsuccessful_message_format_with_single_attachment_video_v2 : le.f(str4) ? R.string.unsuccessful_message_format_with_single_attachment_audio_v2 : R.string.unsuccessful_message_format_with_single_attachment_v2;
            } else {
                i4 = R.string.unsuccessful_message_format_with_multiple_attachments_v2;
            }
            String strB5 = ejwk.b(string);
            String strB6 = ejwk.b(string2);
            String str5 = cpgcVar.e;
            if (str5 == null) {
                string3 = null;
            }
            String strB7 = ejwk.b(string3);
            String strB8 = ejwk.b(str5);
            String strB9 = ejwk.b(string4);
            String str6 = cpgcVar.i;
            if (str6 == null) {
                str6 = cpgcVar.l;
            }
            return resources.getString(i4, strB5, strB6, strB7, strB8, strB9, ejwk.b(str6), ejwk.b(cpgcVar.j), ejwk.b(cpgcVar.k));
        }
        if (cpgcVar.d && z) {
            int i10 = cpgcVar.f;
            if (i10 == 0) {
                i3 = R.string.success_sent_to_message_format;
            } else if (i10 == 1) {
                String str7 = cpgcVar.g;
                i3 = le.s(str7) ? R.string.success_sent_to_message_format_with_single_attachment_location : le.m(str7) ? R.string.success_sent_to_message_format_with_single_attachment_image : le.z(str7) ? R.string.success_sent_to_message_format_with_single_attachment_video : le.f(str7) ? R.string.success_sent_to_message_format_with_single_attachment_audio : R.string.success_sent_to_message_format_with_single_attachment;
            } else {
                i3 = R.string.success_sent_to_message_format_with_multiple_attachments;
            }
            String strB10 = ejwk.b(cpgcVar.e);
            String strB11 = ejwk.b(string4);
            String str8 = cpgcVar.i;
            if (str8 == null) {
                str8 = cpgcVar.l;
            }
            return resources.getString(i3, strB10, strB11, ejwk.b(str8), ejwk.b(cpgcVar.j));
        }
        String string5 = (ejwk.c(string4) && ejwk.c(cpgcVar.i) && ejwk.c(cpgcVar.l)) ? null : resources.getString(R.string.said);
        int i11 = cpgcVar.f;
        if (i11 == 0) {
            int i12 = cpgcVar.n;
            if (i12 == 1) {
                return resources.getString(R.string.success_message_self_sender, ejwk.b(string4), ejwk.b(cpgcVar.i), ejwk.b(cpgcVar.j), ejwk.b(cpgcVar.k));
            }
            if (i12 == 2) {
                return resources.getString(R.string.success_message_unspecified_sender, ejwk.b(string4), ejwk.b(cpgcVar.i), ejwk.b(cpgcVar.j), ejwk.b(cpgcVar.k));
            }
            i = R.string.success_message_format;
        } else {
            int i13 = cpgcVar.n;
            if (i13 != 0) {
                if (i13 == 1) {
                    if (i11 == 1) {
                        String str9 = cpgcVar.g;
                        i2 = le.s(str9) ? R.string.success_message_self_sender_format_with_single_attachment_location : le.m(str9) ? R.string.success_message_self_sender_format_with_single_attachment_image : le.z(str9) ? R.string.success_message_self_sender_format_with_single_attachment_video : le.f(str9) ? R.string.success_message_self_sender_format_with_single_attachment_audio : R.string.success_message_self_sender_format_with_single_attachment;
                    } else {
                        i2 = R.string.success_message_self_sender_format_with_multiple_attachments;
                    }
                } else if (i11 == 1) {
                    String str10 = cpgcVar.g;
                    i2 = le.s(str10) ? R.string.success_message_unspecified_sender_format_with_single_attachment_location : le.m(str10) ? R.string.success_message_unspecified_sender_format_with_single_attachment_image : le.z(str10) ? R.string.success_message_unspecified_sender_format_with_single_attachment_video : le.f(str10) ? R.string.success_message_unspecified_sender_format_with_single_attachment_audio : R.string.success_message_unspecified_sender_format_with_single_attachment;
                } else {
                    i2 = R.string.success_message_unspecified_sender_format_with_multiple_attachments;
                }
                String strB12 = ejwk.b(string5);
                String strB13 = ejwk.b(string4);
                String str11 = cpgcVar.i;
                if (str11 == null) {
                    str11 = cpgcVar.l;
                }
                return resources.getString(i2, strB12, strB13, ejwk.b(str11), ejwk.b(cpgcVar.j), ejwk.b(cpgcVar.k));
            }
            if (i11 == 1) {
                String str12 = cpgcVar.g;
                i = le.s(str12) ? R.string.success_message_specified_sender_format_with_single_attachment_location : le.m(str12) ? R.string.success_message_specified_sender_format_with_single_attachment_image : le.z(str12) ? R.string.success_message_specified_sender_format_with_single_attachment_video : le.f(str12) ? R.string.success_message_specified_sender_format_with_single_attachment_audio : R.string.success_message_specified_sender_format_with_single_attachment;
            } else {
                i = R.string.success_message_specified_sender_format_with_multiple_attachments;
            }
        }
        String strB14 = ejwk.b(cpgcVar.e);
        String strB15 = ejwk.b(string5);
        String strB16 = ejwk.b(string4);
        String str13 = cpgcVar.i;
        if (str13 == null) {
            str13 = cpgcVar.l;
        }
        return resources.getString(i, strB14, strB15, strB16, ejwk.b(str13), ejwk.b(cpgcVar.j), ejwk.b(cpgcVar.k));
    }
}
