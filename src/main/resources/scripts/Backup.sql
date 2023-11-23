PGDMP                      
    {            real_estate_db    15.2    15.2 #    �           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            �           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            �           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            �           1262    33554    real_estate_db    DATABASE     �   CREATE DATABASE real_estate_db WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE_PROVIDER = libc LOCALE = 'Turkish_Turkey.1254';
    DROP DATABASE real_estate_db;
                db_user    false            �          0    33556    advert_types 
   TABLE DATA           G   COPY public.advert_types (id, create_at, update_at, title) FROM stdin;
    public          db_user    false    215   ~       �          0    33563    adverts 
   TABLE DATA           �   COPY public.adverts (id, create_at, update_at, advert_status, built_in, "/desc/", is_active, location, price, slug, title, view_count, advert_type_id, category_id, city_id, country_id, district_id) FROM stdin;
    public          db_user    false    217   �       �          0    33573 
   categories 
   TABLE DATA           k   COPY public.categories (id, create_at, update_at, built_in, icon, is_active, seq, slug, title) FROM stdin;
    public          db_user    false    219   �       �          0    33580    category_property_keys 
   TABLE DATA           Q   COPY public.category_property_keys (id, built_in, name, category_id) FROM stdin;
    public          db_user    false    221   �       �          0    33587    category_property_value 
   TABLE DATA           a   COPY public.category_property_value (id, value, advert_id, category_property_key_id) FROM stdin;
    public          db_user    false    223   �       �          0    33594    cities 
   TABLE DATA           L   COPY public.cities (id, create_at, update_at, name, country_id) FROM stdin;
    public          db_user    false    225          �          0    33601    contacts 
   TABLE DATA           c   COPY public.contacts (id, create_at, update_at, email, first_name, last_name, message) FROM stdin;
    public          db_user    false    227   �!       �          0    33608 	   countries 
   TABLE DATA           C   COPY public.countries (id, create_at, update_at, name) FROM stdin;
    public          db_user    false    229   "       �          0    33615 	   districts 
   TABLE DATA           L   COPY public.districts (id, create_at, update_at, name, city_id) FROM stdin;
    public          db_user    false    231   6+       �          0    33622 	   favorites 
   TABLE DATA           Q   COPY public.favorites (id, create_at, update_at, advert_id, user_id) FROM stdin;
    public          db_user    false    233   %J       �          0    33629    images 
   TABLE DATA           a   COPY public.images (id, create_at, update_at, featured, name, path, type, advert_id) FROM stdin;
    public          db_user    false    235   BJ       �          0    33638    logs 
   TABLE DATA           X   COPY public.logs (id, create_at, update_at, log_action, advert_id, user_id) FROM stdin;
    public          db_user    false    237   _J       �          0    33646    roles 
   TABLE DATA           .   COPY public.roles (id, role_name) FROM stdin;
    public          db_user    false    239   |J       �          0    33654    tour_requests 
   TABLE DATA           �   COPY public.tour_requests (id, create_at, update_at, status, tour_date, tour_time, advert_id, guest_user_id, owner_user_id) FROM stdin;
    public          db_user    false    241   �J       �          0    33661 
   user_roles 
   TABLE DATA           6   COPY public.user_roles (user_id, role_id) FROM stdin;
    public          db_user    false    242   �J       �          0    33667    users 
   TABLE DATA           �   COPY public.users (id, create_at, update_at, built_in, email, first_name, is_active, last_name, password_hash, phone, reset_password_code, user_name) FROM stdin;
    public          db_user    false    244   �J       �           0    0    advert_types_id_seq    SEQUENCE SET     B   SELECT pg_catalog.setval('public.advert_types_id_seq', 1, false);
          public          db_user    false    214            �           0    0    adverts_id_seq    SEQUENCE SET     =   SELECT pg_catalog.setval('public.adverts_id_seq', 1, false);
          public          db_user    false    216            �           0    0    categories_id_seq    SEQUENCE SET     @   SELECT pg_catalog.setval('public.categories_id_seq', 1, false);
          public          db_user    false    218            �           0    0    category_property_keys_id_seq    SEQUENCE SET     L   SELECT pg_catalog.setval('public.category_property_keys_id_seq', 1, false);
          public          db_user    false    220            �           0    0    category_property_value_id_seq    SEQUENCE SET     M   SELECT pg_catalog.setval('public.category_property_value_id_seq', 1, false);
          public          db_user    false    222            �           0    0    cities_id_seq    SEQUENCE SET     <   SELECT pg_catalog.setval('public.cities_id_seq', 82, true);
          public          db_user    false    224            �           0    0    contacts_id_seq    SEQUENCE SET     >   SELECT pg_catalog.setval('public.contacts_id_seq', 1, false);
          public          db_user    false    226            �           0    0    countries_id_seq    SEQUENCE SET     @   SELECT pg_catalog.setval('public.countries_id_seq', 244, true);
          public          db_user    false    228            �           0    0    districts_id_seq    SEQUENCE SET     A   SELECT pg_catalog.setval('public.districts_id_seq', 1947, true);
          public          db_user    false    230            �           0    0    favorites_id_seq    SEQUENCE SET     ?   SELECT pg_catalog.setval('public.favorites_id_seq', 1, false);
          public          db_user    false    232            �           0    0    images_id_seq    SEQUENCE SET     <   SELECT pg_catalog.setval('public.images_id_seq', 1, false);
          public          db_user    false    234            �           0    0    logs_id_seq    SEQUENCE SET     :   SELECT pg_catalog.setval('public.logs_id_seq', 1, false);
          public          db_user    false    236            �           0    0    roles_id_seq    SEQUENCE SET     ;   SELECT pg_catalog.setval('public.roles_id_seq', 1, false);
          public          db_user    false    238            �           0    0    tour_requests_id_seq    SEQUENCE SET     C   SELECT pg_catalog.setval('public.tour_requests_id_seq', 1, false);
          public          db_user    false    240            �           0    0    users_id_seq    SEQUENCE SET     ;   SELECT pg_catalog.setval('public.users_id_seq', 1, false);
          public          db_user    false    243            �      x������ � �      �      x������ � �      �      x������ � �      �      x������ � �      �      x������ � �      �   �  x���Kn�@���)�����ɮ0��i�,�r�`Vg��{M9�8���T�W/�N����pxQ��'�^�,M������ G;��>�d5PM���14B&�\'_}�)"kj�5C�3�=B�#^������|���CQ� Мlet��^x��u����Fpd�qw^�Y��:�;�έ�H_��^H�/�}чD��mE��[�\�Ɛ��#��T����\���"��v�<r�G�u�����H��'���TȢ�4V�$0����%r
���I��gV�Jݚu�O�ܪ[!�g�h�-�����߬�^�����r���}*)�2B^�Gy��5BZK�h	��O�(a�"��\��p�|r�v��>��'Wm�ى�ON���y4�Qԍ��!���Voi��F�c���bd��]�1�h����4�;$F"�r��h��&K�#���Y}����?�y͛�.�"FJ�-�#�u�NV�I�κ!$ȣӗ��3�N��z�46���D�P��R��%0A
[��Q� �|0p:��:�]#5A昽�ty��u��/(���Cr��u��1��)R�������O�l��ђ"�\�$�V�^�M����[*�=Nù��<TM�]-k(Cs�ޒ@28F�?28C���9�2x�R�|5Xyґ�#��l��3����\nQ �|a�|ːls	�/xr�/7��#܅�;��G$�i��� N��J]n�Iد��~���c      �      x������ � �      �   	  x���Ks۸�����2�JR&���l�K��%;uSٴ(DDD��G��s���n�ƮR�����8`�!��_��K6H��_�'�{_������>��^R�������z��4��1�T=ǅ�P������,�:�J��1y��!��c�[�R�	�EWB��Qe+!o�&M��-�$:�g�q�A��jH)�PYe�RX!�!��b�)���JUHAmm���� L�3)��Ƥ�A\m2F�L�e)�&c���,|c2��̖"��K+�1@��5#t�xmF�̆J�-ctΊ��!�d|鞀;�d|���"�چ�]�'����YTI1��d�]�2�*�֕f@Q׺�Hn�C��[��ـ�}ؘ%bm]r���H)�P��\�.���
Ә\J�̀B�x��3Fu(��/�V(m�6��y��P�6y�aa�>c8�M����"�"�%����ro�q^���3��Bf����c3j�!���aP���^bz�r�o���Y�^~z��ї��kզ}�r���Qa�E���ɬ�ɹ�|%�L�'ma�%����u(M��'��Z}@������͓wOB��W��)^-��f���ڼx�C���֕��9d������3�幯\�sz�h�(߭�C��"�(��2`�ͺ5���E���|��X]���!w\EW[�#w�T��]4��f�!�h�תd�.�\�oړ�c�*�N��1���}]KG������w��.�1z�A�ܚ#��2��1�;�ė��6:���n��_��V�Ť0�W2GM<fD��K�ǌ��a�B��
���s̨]:m�ە��^bcc���`-�3p��c�A�����+�[����)��섒�z������n�	�ӧ�
��}9sh�9���Fa�0BׂN֜0@�V�K����q��o�	w�e�L�M>>j9G������O����"��NL(��-�`ΐ^�]�JF�&�]��{�h�)�����y'�c8o�?ws]���X�c���!�	//�H�1�6acݦ�1p7M[BȸݴR�5U�a��;*��7Y�#R��VS�|�a�]�񺕭���IK��rk덾#t낛c�@����X�l��J��٫�q���H&�~��&,7�~��2�R�c�FҪ��R;ed�R{�5�5��o%#5r�ΟL���2���ȡEomݴ��2T#���RSj���?{��	��2�\0�Q��.��4�v��z)M�V!��
�QyFlS�D��.mR�҅{Bs�R�R�9�5��:�i,�)�,_�cJmi��;Z�R�d,�g�>��[Ɣ�'c����G���?.G�P�d���R�]2���?��C�ݟ2S;�3��Yi۠��7j��}�>5H�~�]}���$ctn�.�ܡнBJ��;D@�����kA��ȝ��.����N��1GY꒤fȝ}N�R��j����������z� ˨��ߝ[Z ��H��ND(:��@M��߾|q�0��¯[ӱ�ŵ���`賠�.��J+:�G&���S�L �Im�l�IRϒ�	^�R!�6�u�D�g�K�2�C�E���ՕG͐I�J�^��`E��ksqsKM���C��!�N\��>���֫Y��G�����)u>�m��vl����U_���q�F�h.�ª��]�!��qzw~
!�6W�ɵ-���R;��ߺ�m�M��}r�M�~�(��+3��z�P�l�W��SvoNw��GW��u0�I�{.}hR/�?�O��2�>I�!�L�'3_��3��ܭ�?��2��p�i��LR�ejkۭ �Lm��.�g�qA_������ u]��P��E�9�ꥬ�����.�d��I�@!��Ȩ�2�##�v��Q[e��\vצ(�MjJ9E��w&�k$��"��./�='��?!�|�KFR��)ިfBF��)�w�2)��$�\�:}�o�
�X����'�Z(2j�L��LqQ�L�]��?�)��v,�b};ʨ'3����$��y�L����if��횔��43��Zu>'�k����$�3ڳB^&���ʇ/#�:`Nݛ�_z��_Y��2��̰_��Q�f��t�m���A���n3���bX��#��qS��8*��P����j��"��!C����%���~�����E]�>.*�n��WE��n�-���W���tƼހ�=��ڇ�{l���6���y��3j =l��e�R�Q�(-�Q�E|�F	Ԩ��l�`�)��P�^K��d��F2��?�����ɨ5�C����}ۨ��:D?4���������JK 5�~���5�~�j.�gk~}5��2��      �      x���Kr�@����)�������5ɦ���<��G7�J�3���5U�J�Mv����P@wuvU���Ǜ��w���������������������7��ݤ&������?O����!u@�zy��?��߂��:�#�Ϗ6����fr��O�שO�Cj*�����a��S�q��}/ȓ�#/�A��]o��s��^�oH}uyI-`������Oݷ�P��v�G{�5p��������Ϗ��?ʏ�<tv!w�*^^�]s�����s��P����k�����Y�Ø@*����T:0�C�*���`�q�*�������T7�?n��~K�].P�ͱ9��]4q�7{�g��m���&uM�+���RW}ܟr�_����w���C-p�|6�59~\9�pܦ�-�A�0$����Vy�F�m>�8�?p+��j���k���[����*wڕ諸��n�p��N��&��tjF���ʭߧ��w�V��^������ʩ;��&���j���ln�����3�wʳ�d�6Q���X��S��@V���ۦ��^yԆ�T����{���=���-�7:��kV�|��5�a��iKnf�'�@�3�9�{�ˣM���u\���9��ʫ�4lb� `���6�7��+���i/o�i[�N`��l�pj/��卼�q<T����.��cG\9؞��!/`�\�W�A97�|m�U�M�Xa#��j���@�C76ǐT����{ň+z�T��g�ʇ�w�]8邵�f��*�M_�N���E�yx��G��|�X���W�	\Ʊ����G��inSǧ�X��������L�;��dĞ��3�|y���a��?^l>|Z(���j�K��4�!���r��ؤ���~)���~H��i��x��z!ʥ�������xy�X�ʽs�|Q}�����KN���m��yrX9�����-�}�`ed�[*�*�.��l��",��GjC@�r��|dϜ��$?�d�	�Q�z}�<l'�a�������..^����O�fB����'�]�*/�Gs��_�'�c_O����k�gj�i�G-��϶X-,S��/GJhȽ�`�mq��*{�H�gg#[��O)9X�Fm�$+GWFT��O��'+e�d��n����M�������r V���K����x
RN����|��V�S�<5d�����$�Ża���.U��⣒MM~��jh:$��n$�<S3Y�E[Kۿ���b�[�Q�\������+?Rl��zH9��>m�͎�尚�Ӵ4A��"��&1�r`�)�7*��ڦ"���V��ن��m��Χ��_C�rP���|O�ĥ+�"X(�",����sl�s�!��O7���|�ZZ9�V^��"mg�G�Ԁ6��.J�0K��N6�R>���J-�|3!x���zK���ss����$dS`��wZ0av�(!�g�s�VX����lA����o4�yXi�Y6L����z�=,#�doV�T��t��p��0�Z���\���a�)�/��������;�6t�>�ALJ!�ʣS3D����~��w�K� �[�W>=����y���Z愕G�gX�f�.X��yWux�~�-U�6`(ҢН�����|y�w��x)y0�Sm��	�|�
a���`� "@�ʫ���W5a ={y�|����+�~�~i ��]�M�[u���;���M�<ǥ T~����=�R:6ؼ��9��I�S�kȦ"�EIK��f��ɮ���zhl-B�`[�?ήב�[��H� \��X
A�4��EX�rL�y�)�.��h>h)�|���l�ԁK���հ�V^�t�y���-<q�rĝ,V즠�3��Y/C�APlQd�ְ�r��{c�3����m�u�gr3#�ZJgׄH�ݔ܌�t��t��HC������o
��^�H� �-�H��h���[oT�D3B�:�P�Y��c���&�[m]��`׳������ç
^�ե�m�ʫ6�v_W.}
�:�r*�M��IѨ�Ø���<:��w@Z��Ø��TG;�V{2����k^9�c*�ʷ�Eʹھ(�b���<�MHibt��\���'����I��"�` ��*��
�M�����*�mN�g@+��z&a9���9zz+x,��0��nS��I'��/��J^�mܪ�������Co���(^n�B;կ�z�K�6kL\y�j�=+�^߳vU�9���i�9O������|�[.J,
T���M�Ʀ���N=Wn��C�m����qV� ���r���3�[����"���R����2[҆A���"X��&a˄�ԒZ���E�(]�V�����4p�;�Ik��:��p-vϮ�|:ٵ�rXH�a[��-ks\��&�B~�x��RO������r*�s$/�/�NkOA#�7��z���&ВD��u�yb�Ά\�:O���z1������3��&�ZD�q�h���k���T��tJ�T�Z��ӌ����]\�J�(��霆`�S7X��/�:��j!��§��O=bhQ6\y��Ru�H=��b/�3�y(�K��%�ʫ(��۔rR��5��C�X�B]�c�zܦ�oP�D[��uTԜ�s(W�RJ�1{�HZ�YOqwRA�guFY���������D՞�n���բDH�S�^P�؋�o�ch�#��C�@���.`)&��继��|�;�ۺsTﱝ��򪅉�gZ��)G=��rhc�K̓|A�<���^�2Y��ְ����/]��>�So��[�Kɋx���;���ma��r�R��+�o	�y֕��	׶":B���������!׾4��1�@�4������e"`r�;*u��q����u
Y�+O�{p\�c�����wn�!آt@dʐ/-,忱���a(W�y�߮FV�����	�H��V�m���R,�A�!����\>?^:����1P��Yu������J����r�%���U��-�\N�;?�B�B�fa�5��r汙�Hy��U;O�[�C�'���DO�e����WN� ��GĕW�\=CYt�ǩX���C������Ư/HW�5'{$�-�Pxb1�������K��B�#L�X�,�ܽ�v��Q:�ӎ�r���8���4���(,*[-�Tu�(�wS�D0�r�� /2�:&ϟ����Q�ګ Y�O9z,�W~�!���q�N�0(���V�^�|�a�:���M=�̉K�����y)"Y�o���[h�ޗ�c�(��F���.J��Ӷ�W��R��l�G��D<zb"�R�� ��{�(��}O���0���+��鴮Q�;On/(&��_���t��:���pa.(a�N���1䍽��C��k'c˕��w����4(H{�=���Ѻj��:�`eu��mj�0#��.(������p�&X��zk�m�����i�'�B�a�K��~�]Ӣ�q���z�]��ya�n��u����T۴LZ�ô+e�`e���r��ѳ-�\6��
�u誊aX��.�l���eZ]~�U_�U��:)�+J����ɋ*�*'����=m�����-j��ɽHfK����IO�.Y�����(�D	��T�xA��#/7��3T�JiD�a���W��W�4�}��[��1��^)^jDX�J���}k���a�&�YVl�@�������vU�����6�ۻ�д+(��v�:#)5��K�)6`R�I;�p���w��ఌ���b�2-��;�pW���=S�%]��������{��Hg>�P��Kͥ��ۖ
�â�,�p�QN�����Yy��K�z��.��pA���9�!.󖘝l��lA;�
�>c�m.�:/���{R��6�\��L9��F��0��O,�٤#Y���G򌾽IE�st������U_OT�T��ޣ��A��l.X*ɗ7���k��*�m������A�JM�@�����k}�����\�6�P�
sᅋ��4)+:�bF�-�ؔ�^��d�u9������,���[ۯ"a�w{�v�$"ũ%ϣ�S����ޡ��@� �  ����:Y���`�\o��(=� ��i���0��6�z-rF�3�{�r>>���}ʉ�ci�:�ɦ�6�.Hn��G���r������wă���s(����%7�l�D��.=3�%%{�}q
�`��{�d�X�-4���Ζy`�.9.`)L�{Y�Jak\�����x�R��zZy�M��L�o||���k��6r�������_�'��-%��tY%�LM}/�֤�>�t7�ך���J��W4ۄ�r3)PMM�u�=�e�Z��}��@jU��z�I���kFI� ��-`���a���-����`�-Aϗ'.k�/o}��<�p��RC�~;-�N=�E�4(�X�ϱ�n��� �?�J�,2&���A��n�~:]��e�0x�\�7U��և,U�����>�
�
$�Wg�|�G)jԜ��5��U�O�߁��Ϗ�c��eme�x���7²B�L� �@
V�?�6`�Z���7�����Y)Q�W�𮯁�n\v��^-��(8!�ܸ����`u����	�F4��+�B�����i cal�׻�2�!E�
q�P��c%
�G��(q�q���&�܊� &��@f��)�M ����\���K�ɵ�5�rR=s|y�w]�X�a�O3���E��Zo�a�Z�t��\�ʭ޴k!к Ң=ߪ��nOr����k��n!�&
�i\��T����0����Y]�Bɜ�+w�S�{�`e�ձM�o��Ô3V�u�k]�F��)z��[�u�����y)4�V��.G��J ��(���Q$6:aƣ�.��p��%qN �线|��z�g�p�7��/h�����a�[<�mr^HK�ɻm捗a���̄e�q>4h�uRy¸����P>~,9X�y�˽|_���l�8���u����@o'��(���5�
h�{�y�V�M�y3�u���)�&[�S��g^�7�,?�iH���Lr����7k�����̓�Rmb-����7����eT�J�m\�T�v�4T��>��e�m����l��q/h1KZ�ֹ�OE�L��]�r%�u��@����~��h�EP
�p�Ο�&�ӿt��u��|��4�� `��߿ #⣟�������+MJ[��7ڧ�_�	�������g��#/?U�1cj��֙|�fM�%�g:^�ΑB����V�I����i�(/��,]����o�湊��@d�U<9�|Ig��W^Ф�/3i)2Փ�@��[JLhAY��Tl�\/F����?�Ԝ�^�~URtB��EY�%��-G�ym��4O���J�	�%���Sl}�N)��2�����Fv.��#:i�|���x�a {p�yT6s���K�R��]b/|a�*a�T(H���,�'.�	K���+��C\����?<������5@��Ã�:1����������2H�<�4�k�-�֟z�?ZN���#l�*y<���l��N{X�Y*O��&�O�h&D�XO�}�ן�M����u�h�=�h!����<:�W��������caP�Nl�ף�+���XH��3wyZ���בM)?Q��I�>M�z��$rs���.�>���f���~b����	��".�l�
�`తʑa!���Ob=n.�ʧnpby]�32*zrZΰ6�B��@��02º7�R1˓���^�����G�M#i�01�y��#x���j�8^a�ug�tv	la#����s��{��uk�g3������q��rA����mS1A����~�� ^�G��1��ގE��ץ����� �~:t�}��W��nXV���Ьw)����D{u�O�X��������eܔFϾ$�ܹ�#7����3i���O���:oQ����>�ȧm�&�/�I��^/Hj�����u[��{���*��l�O�ĴY[�]ǄS����a[\����2
N�M@�S�p�g�ڙMZ�y�=
s�+_�m�=+��-#�ǟN벬�������}��0(9�~/h!N���dV?�Bo�-Hz-e���u�R��u���t�aӪe>޺��W�����*����=Р��y�ʫ�����R���ƛ�;���c���kyiޤa��.P�ڴ^�ԕ��E��y�3�>�_�iR��6��릗o�$���p��yv-te{m��v����I^uH\*L��WWI��;�۬AX�Q����KJKm��yٺ+���a��ʫ^<�çRX�Ԫ���Jbo~�إ�$s���RS�u�
�Ҏ��_�AX��Sk�@�:������h��^�z�;^���e}�
43�܉�4���Z4��W�a��u%l�Mĥ����JU�C�k�n����^y))�6[�͠0���L�@n&Y)����bXcLXά��98��U�=k�AKE	UD�I�:3b>ǕH9��y��f�N6?yjO�������΍�m���qݮv���c������s]�K��ޗ�z-���>���դ8��{��B�ݰ�������j�\ي���S|�Z�ñYFZ.m�d}���VV��s�O�*nN/#��[��2�dF)$�yYY=�zuZ�D*I�@�U~l��z�RF,*]�D���\�l�@^�7���r�ٕ�~͞���V3㑸N�k�@���-u��O�@�Λ�S��r��@X����K�ʥh�v�^�t���ǀ����u���	�3�A#-�^{k�p��LW�z�S�J����q�RAz����-u%࢓R��-d꾗\2�S��h����y�ѯcIi �]��pu5,�6ȽoRȀ��Lw��RF�8�tкӥ�.o]к�j���N��>=/�}NM�2,:��Z7A�R	��<�\�W�J	��Bw������Y)#�HI6������;�D��Y���u４���%�˾���E�ʩ[[����-d��<_�6Xe�@�Gl�ن�����`����Z{�	(`�#�`Һ.�Ok,@����8��=�ty	���������2�~x�w�M��')�˶�R�p�Rxyi��aO���
=�>���q �L���Z���S3A �`\
C�?n�`t$,�
]q��3��>����N�?q�Z�����@�&[�8ZS�5a(]kԸ^�T��+�ɽ�j�vH���/���s���p�맳Z31(�)�߿���H��ݤ�&��	-v>��G�,++��sSM���&�L|���o^�,S�%�B9uA+4�EuqX���u^ŔYK������&9;J��6eBDŽ,�Hi�l�!�uUk��:t ��<o�|��ua��������O�"Md��ty��ە#�T��T��iPpfz��3���S��x�c��*��S��j�m���*�|l�W��+�`=���;�ѧ#-����Ⅻ���xÑ��jt"��X�c<�?���͔8�ّ6�)��������G�Dַ��=��{4�e�������u��a	�m�Ƽ����@�,F�`�m���#/�&$*�˂�]�QfJ\zԳ�mMZv9��t�:�����9��b���E�m��eɯ����}�����4N�7��>�0;>=9.�W�iߤ��Ɵ7z���C��b�Qi��Zܷ�D�.��<n����/���Қ�L\~��.�[܅E�׊.������w��4�9K��� \o��UX�Ea7�z�������%8ы���8����d�g�6�)!�r��_�}���-��*�D��ӥ�����Rk���>\�h��>J;�������lc������`���3_|�[�X}�����Ǐ��N      �      x������ � �      �      x������ � �      �      x������ � �      �      x������ � �      �      x������ � �      �      x������ � �      �      x������ � �     