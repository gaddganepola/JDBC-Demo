PGDMP  )    5                }         	   JDBC_demo    17.5    17.5     �           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                           false            �           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                           false            �           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                           false            �           1262    16388 	   JDBC_demo    DATABASE     �   CREATE DATABASE "JDBC_demo" WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE_PROVIDER = libc LOCALE = 'English_United States.1252';
    DROP DATABASE "JDBC_demo";
                     postgres    false            �            1259    16390    student    TABLE     [   CREATE TABLE public.student (
    id integer NOT NULL,
    name text,
    marks integer
);
    DROP TABLE public.student;
       public         heap r       postgres    false            �            1259    16389    student_id_seq    SEQUENCE     �   CREATE SEQUENCE public.student_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 %   DROP SEQUENCE public.student_id_seq;
       public               postgres    false    218            �           0    0    student_id_seq    SEQUENCE OWNED BY     A   ALTER SEQUENCE public.student_id_seq OWNED BY public.student.id;
          public               postgres    false    217            !           2604    16393 
   student id    DEFAULT     h   ALTER TABLE ONLY public.student ALTER COLUMN id SET DEFAULT nextval('public.student_id_seq'::regclass);
 9   ALTER TABLE public.student ALTER COLUMN id DROP DEFAULT;
       public               postgres    false    218    217    218            �          0    16390    student 
   TABLE DATA           2   COPY public.student (id, name, marks) FROM stdin;
    public               postgres    false    218   �
       �           0    0    student_id_seq    SEQUENCE SET     =   SELECT pg_catalog.setval('public.student_id_seq', 13, true);
          public               postgres    false    217            #           2606    16397    student student_pkey 
   CONSTRAINT     R   ALTER TABLE ONLY public.student
    ADD CONSTRAINT student_pkey PRIMARY KEY (id);
 >   ALTER TABLE ONLY public.student DROP CONSTRAINT student_pkey;
       public                 postgres    false    218            �   �   x����0뽏A8��s�Hǣ�DEs�H>��H���s�v��l�Av���<N��HL=.�f`
�TLȁ"��V�=%<��L�ĸʦ߂�)�KS��8묂��9��*Z�n2k}8��V��.��y �?�%;     