package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crao {
    public static final cczi a = cdag.c(cdag.b, "text_classifier_entity_confidence_threshold", 0.0d);
    public static final cczi b;
    public static final cczi c;
    public static final cczi d;
    public static final cczi e;
    public static final cczi f;
    public static final cczi g;
    public static final cczi h;
    public static final cczi i;
    public static final ejxr j;
    public static final ejxr k;
    public static final cczi l;

    static {
        cdag.h(cdag.b, "enable_miniature_contact_message_annotations", false);
        b = cdag.h(cdag.b, "enable_text_classifier_webref_message_annotations", false);
        c = cdag.h(cdag.b, "enable_text_classifier_address_message_annotations", false);
        d = cdag.h(cdag.b, "enable_text_classifier_contact_message_annotations", false);
        e = cdag.h(cdag.b, "enable_text_classifier_datetime_message_annotations", false);
        f = cdag.h(cdag.b, "enable_text_classifier_map_link_message_annotations", false);
        g = cdag.h(cdag.b, "enable_text_classifier_email_message_annotations", false);
        h = cdag.h(cdag.b, "enable_text_classifier_phone_message_annotations", false);
        i = cdag.h(cdag.b, "enable_regex_message_annotations", false);
        j = cdag.v("enable_annotations_in_example_store");
        k = cdag.v("enable_prefix_map_link_annotations_regex");
        l = cdag.g(cdag.b, "map_link_annotation_regex_example_store", "(http(s?)://)?((maps\\.google\\.(\\w)+/)|(maps\\.app.goo.gl/)|((www\\.)?google\\.(\\w)+/maps[/?])|(goo.gl/maps/)).*");
    }
}
